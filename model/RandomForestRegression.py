import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestRegressor
from math import sqrt

features = pd.read_csv("bike_data.csv")
features.head(5)
print("数据维度:",features.shape)
#features.describe()


plt.style.use('fivethirtyeight') # 绘图风格
id = features["ID"]
x = id
y = features['price']
## matplotlib
plt.plot(x,y)
plt.show()

# 独热编码
features = pd.get_dummies(features) #自动转换，自动添加后缀
features.head(5)
print(help(pd.get_dummies))

# 数据与标签
# 标签
labels = np.array(features['price']) #价格
# 特征中去除标签
features = features.drop('price', axis=1) # 按照列去掉
features = features.drop('ID', axis=1)
# 名字单独保留
feature_list = list(features.columns)
# 转换为合适的格式
features = np.array(features)

# 数据集切分
train_features, test_features, train_labels, test_labels = train_test_split(features,labels,test_size=0.25,random_state=42)
print('训练集特征：',train_features.shape)
print('训练集标签：',train_labels.shape)
print('测试集特征：',test_features.shape)
print('测试集标签：',test_labels.shape)

# # TODO 实现以下函数并输出所选直线的MSE
# def calculateMSE(X,Y,m):
#   return sum([(y-m*x)**2 for x,y in zip(X,Y)])/len(X)


rf = RandomForestRegressor(n_estimators=170, random_state=42)
rf.fit(train_features, train_labels)
predictions = rf.predict(test_features)
errors = abs(predictions - test_labels)

# 衡量线性回归的MSE 、 RMSE、 MAE、r2
mse = np.sum((predictions - test_labels) ** 2) / len(test_labels)
rmse = sqrt(mse)
mae = np.sum(np.absolute(predictions - test_labels)) / len(test_labels)
r2 = 1-mse/ np.var(test_labels)#均方误差/方差
print(" mae:", mae, "\n mse:", mse, "\n rmse:", rmse, "\n r2:", r2)

mape = 100 * (errors / test_labels)
print('\n MAPE:', np.mean(mape))

print(test_labels)

#树模型可视化 有问题！！
# from sklearn.tree import export_graphviz
# import pydot
# import os
# # os.environ["PATH"] += os.pathsep + 'S:/Graphviz/bin/'
#
# tree = rf.estimators_[5]
# export_graphviz(tree,out_file="tree.dot",feature_names=feature_list,rounded=True,precision=1)
# (graph,) = pydot.graph_from_dot_file('./tree.dot')
# graph.write_png('./tree.png')

# 决策树特征重要性
importances = list(rf.feature_importances_)
# 格式转换
feature_importances = [(feature, round(importance, 2)) for feature, importance in zip(feature_list,importances)]
feature_importances = sorted(feature_importances,key=lambda x:x[1],reverse=True)
# 打印
[print('Variable:{:20} importance: {}'.format(*pair)) for pair in feature_importances]


ture_ID = np.arange(1, 44, 1)
print(ture_ID)
pre_ID = np.arange(1, 44, 1)

#真实数据
true_data = pd.DataFrame(data={'ID': ture_ID, 'actual': test_labels})
#预测数据
predictions_data = pd.DataFrame(data = {'ID': pre_ID, 'prediction': predictions})
# 真实值图
plt.plot(true_data['ID'], true_data['actual'], 'b-', label='actual')
# 预测值图
plt.plot(predictions_data['ID'], predictions_data['prediction'], 'g-', label='prediction')
plt.title('Prediction fitting diagram', fontsize='large', fontweight='bold')
plt.xticks(rotation='60')
plt.show()

