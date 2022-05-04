# 导入所需的模块
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split #分割数据
import pandas as pd

# # 已有数据
# height = [0.0, 500.0, 1000.0, 1500.0, 2000.0, 2500.0, 3000.0, 3500.0, 4000.0]
# temperature = [12.834044009405147, 10.190648986884316, 5.50022874963469, 2.8546651452636795, -0.7064882183657739, -4.065322810462405, -7.1274795772446575, -10.058878545913904, -13.206465051538661]
#
# # 数据处理
# # sklearn 拟合输入输出一般都是二维数组，这里将一维转换为二维。
# height = np.array(height).reshape(-1, 1)
# temp = np.array(temperature).reshape(-1, 1)
#


#创建数据
def createdata():
    x_data = pd.read_csv("bikeTrain_data.csv")
    # 必须添加header=None，否则默认把第一行数据处理成列名导致缺失
    X = x_data.values.tolist()
    #print(X)
    y_data = pd.read_csv("bikeTrain_price.csv")
    Y = y_data.values.tolist()
    #print(Y)
    m,n = np.shape(X)
    print("m,n:",m,n)
    one_mat = np.ones((m,1))
    X = np.column_stack((X,one_mat))
    x_train,x_test,y_train,y_test= train_test_split(X, Y, test_size=0.25, random_state=0)       #分割数据测试数据为30%
    x_train = np.mat(x_train)
    y_train = np.mat(y_train).reshape(-1,1)
    x_test = np.mat(x_test)
    y_test = np.mat(y_test).reshape(-1,1)
    # print(x_train[1,:],len(x_train))
    # print(y_train[1],len(y_train))
    return x_train,x_test,y_train,y_test
x_train, x_test, y_train, y_test = createdata()

# 拟合
model = LinearRegression(copy_X=True, fit_intercept=False, n_jobs=1, normalize=False)
model.fit(x_train,y_train)
print('系数矩阵:\n',model.coef_)
print('线性回归模型:\n',model)
# 使用模型预测
predicted = model.predict(x_test)
axix_x1 = np.linspace(0,2*len(y_test),len(y_test))
plt.plot(axix_x1, y_test,'b-')
plt.plot(axix_x1, predicted,'r--')
# 显示图形
plt.show()



