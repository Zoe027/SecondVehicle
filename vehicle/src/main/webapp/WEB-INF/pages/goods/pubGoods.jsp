<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>发布电瓶车</title>
    <link rel="icon" href="<%=basePath%>img/logo.jpg" type="image/x-icon"/>
    <link rel="stylesheet" href="<%=basePath%>css/font-awesome.min.css" />
    <link rel="stylesheet" href="<%=basePath%>css/userhome.css" />
    <link rel="stylesheet" href="<%=basePath%>css/user.css" />
    <script type="text/javascript" src="<%=basePath%>js/jquery-3.1.1.min.js"></script>
   <!-- bootstrap -->
    <link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css" />
    <script type="text/javascript" src="<%=basePath%>js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/bootstrap.min.js"></script>
    <!-- 图片上传即使预览插件 -->
    <link rel="stylesheet" href="<%=basePath%>css/fileinput.min.css">
    <script type="text/javascript" src="<%=basePath%>js/fileinput.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/zh.js"></script>

    <style>
        .container{padding-top:10px}
    </style>
</head>
<body>
<div class="pre-2" id="big_img">
    <img src="http://findfun.oss-cn-shanghai.aliyuncs.com/images/head_loading.gif" class="jcrop-preview jcrop_preview_s">
</div>
<div id="cover" style="min-height: 639px;">
    <div id="user_area">
        <div id="home_header">
            <a href="<%=basePath%>goods/homeGoods">
                <h1 class="logo"></h1>
            </a>
            <a href="<%=basePath%>user/home">
                 <img src="<%=basePath%>img/home_header.png"  style="margin-left: 20px;" >
            </a>
            <a href="<%=basePath%>user/home">
                <div class="home"></div>
            </a>
        </div>
        <!--

            描述：左侧个人中心栏
        -->
        <div id="user_nav">
            <div class="user_info">
                <div class="head_img">
                    <img src="<%=basePath%>img/photo.jpg">
                </div>
                <div class="big_headimg">
                    <img src="">
                </div>
                <span class="name">${cur_user.username}</span><hr>
              <!--   <span class="school">浙师大</span> -->
                 <a class="btn" style="width: 98%;background-color: rgb(79, 190, 246);color:rgba(255, 255, 255, 1);" href="<%=basePath%>user/myPurse">我的钱包：￥${myPurse.balance}</a>
                <input type="hidden" value="${myPurse.recharge}" id="recharge"/>
                <input type="hidden" value="${myPurse.withdrawals}" id="withdrawals"/>
               <span class="btn" data-toggle="modal" data-target="#myModal" style="width: 98%;background-color: rgb(79, 190, 246); color:rgba(255, 255, 255, 1);margin-top:0.5cm;">我的信用积分：${cur_user.power}</span>
                
            </div>
            <div class="home_nav">
                <ul>
                    <a href="<%=basePath%>orders/myOrders">
                        <li class="notice">
                            <div></div>
                            <span>订单中心</span>
                            <strong></strong>
                        </li>
                    </a>
                    <a href="<%=basePath%>user/allFocus">
                        <li class="fri">
                            <div></div>
                            <span>关注列表</span>
                            <strong></strong>
                        </li>
                    </a>
                    <a href="<%=basePath%>goods/publishGoods">
                        <li class="store">
                            <div></div>
                            <span>发布电瓶车</span>
                            <strong></strong>
                        </li>
                    </a>
                    <a href="<%=basePath%>user/allGoods">
                        <li class="second">
                            <div></div>
                            <span>我的电瓶车</span>
                            <strong></strong>
                        </li>
                    </a>
                    <a href="<%=basePath%>user/basic">
                        <li class="set">
                            <div></div>
                            <span>个人设置</span>
                            <strong></strong>
                        </li>
                    </a>
                </ul>
            </div>
        </div>
        <!--

	            描述：发布二手电瓶车
        -->
        <div id="user_content">
            <div class="basic">
                <form:form action="../goods/publishGoodsSubmit" method="post" role="form" enctype="multipart/form-data">
                    <h1 style="margin-left: 210px;">发布二手电瓶车</h1><hr />
                    <div class="changeinfo">
                        <span>二手电瓶车名：</span>
                        <input class="in_info" type="text" name="name" placeholder="请输入二手电瓶车名"/>
                        <span>(*必填)</span>
                    </div>
                      <div class="changeinfo">
                        <span>电瓶车品牌：</span>
                        <select class="in_info" id="brand" name="brand">
                            <option value="1">无牌</option>
                            <option value="2">普通品牌2</option>
                            <option value="3">普通品牌3</option>
                            <option value="4">知名品牌4</option>
                            <option value="5">知名品牌5</option>
                        </select>
                    </div>
                      
                    <div class="changeinfo">
                        <span>使用年限：</span>
                        <input class="in_info" type="text" id="years" name="years" placeholder="请输入使用年限"/>
                        <span>(*必填)</span>
                    </div>
                      
                    <div class="changeinfo">
                        <span>电瓶车型号：</span>
                        <input class="in_info" type="text" id="voltage"  name="voltage" placeholder="请输入型号"/>
                        <span>（48/60/72）(*必填)</span>
                    </div>
                      
                    <div class="changeinfo">
                        <span>电瓶车大小：</span>
                        <input class="in_info" type="text" id="size" name="size" placeholder="请输入电瓶车大小"/>
                        <span>（1小，2大）(*必填)</span>
                    </div>
                    
                     <div class="changeinfo">
                        <span>新旧程度：</span>
                        <input class="in_info" type="text" id="overallHealth" name="overallHealth" placeholder="请输入新旧程度"/>
                        <span>（1-10）(*必填)</span>
                    </div>
                    
                     <div class="changeinfo">
                        <span>破损处个数：</span>
                        <input class="in_info" type="text" id="numBrokenParts" name="numBrokenParts" placeholder="请输入破损处个数"/>
                        <span>(*必填)</span>
                    </div>
                    
                    <div class="changeinfo">
                        <span>电瓶新旧：</span>
                        <input class="in_info" type="text"  id="batteryHealth"  name="batteryHealth" placeholder="请输入电瓶电瓶新旧"/>
                        <span>（1-10）(*必填)</span>
                    </div>
                     <input type="button" class="setting-save" value="估价" onclick="getEvaluation()" style="margin-top: 20px;background-color: blue;"/>
                     <div class="changeinfo">
                        <span>估价：</span>
                        <input class="in_info" type="text" id="realPrice"  name="realPrice" placeholder=""/>
                        <span id="checkphone"></span>
                    </div>
                    
                    <div class="changeinfo">
                        <span>出售价格：</span>
                        <input class="in_info" type="text" name="price" placeholder="请输入出售价格"/>
                        <span>(*必填)</span>
                    </div>
                
                    <div class="changeinfo">
                        <span>二手电瓶车类别：</span>
                        <select class="in_info" name="catelogId">
                            <option value="1">二手电瓶车</option>
                            <option value="2">校园代步</option>
                            <option value="3">家庭日用</option>
                            <option value="4">品牌</option>
                            <option value="5">推荐</option>
                            <option value="6">上新</option>
                            <option value="7">优惠活动</option>
                        </select>
                    </div>
                    <div class="changeinfo" id="dir">
                        <span>电瓶车描述：</span>
                        <div class="sha">
                            <div class="publ">
                                <div class="pub_con">
                                    <div class="text_pu">
                                        <input type="text" name="describle" class="emoji-wysiwyg-editor"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br />
                    <hr />
                    <div class="changeinfo">
                        <span>电瓶车图片：</span>
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-6 col-sm-offset-1">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <input type="file" name="myfile" data-ref="imgUrl" class="col-sm-10 myfile" value=""/>
                                            <input type="hidden" name="imgUrl" value="">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <input type="submit" class="setting-save" value="发布二手电瓶车" style="margin-top: 20px;background-color: blue;"/>
                </form:form>
            </div>
            <!--

                描述：最右侧，可能认识的人
            -->
            <div class="recommend">
                <div class="title">
                    <span class="text">可能认识的人</span>
                    <span class="change">换一组</span>
                    <span class="underline"></span>
                </div>
                <ul>
                    <li>
                        <a href="" class="head_img">
                            <img src="<%=basePath%>img/photo1.jpg">
                        </a>
                        <span>Brudce</span>
                        <div class="fa fa-plus-square"></div>
                    </li>
                    <li>
                        <a href="" class="head_img">
                            <img src="<%=basePath%>img/photo2.jpg">
                        </a>
                        <span>Graham</span>
                        <div class="fa fa-plus-square"></div>
                    </li>
                    <li>
                        <a href="" class="head_img">
                            <img src="<%=basePath%>img/photo3.jpg">
                        </a>
                        <span>策马奔腾hly</span>
                        <div class="fa fa-plus-square"></div>
                    </li>
                    <li>
                        <a href="" class="head_img">
                            <img src="<%=basePath%>img/photo4.jpg">
                        </a>
                        <span>Danger-XFH</span>
                        <div class="fa fa-plus-square"></div>
                    </li>
                    <li>
                        <a href="" class="head_img">
                            <img src="<%=basePath%>img/photo5.jpg">
                        </a>
                        <span>Keithw</span>
                        <div class="fa fa-plus-square"></div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<script>
    $(".myfile").fileinput({
        uploadUrl:"<%=basePath%>goods/uploadFile",//上传的地址
        uploadAsync:true, //默认异步上传
        showUpload: false, //是否显示上传按钮,跟随文本框的那个
        showRemove : false, //显示移除按钮,跟随文本框的那个
        showCaption: true,//是否显示标题,就是那个文本框
        showPreview : true, //是否显示预览,不写默认为true
        dropZoneEnabled: true,//是否显示拖拽区域，默认不写为true，但是会占用很大区域
        //minImageWidth: 50, //图片的最小宽度
        //minImageHeight: 50,//图片的最小高度
        //maxImageWidth: 1000,//图片的最大宽度
        //maxImageHeight: 1000,//图片的最大高度
        //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 0,
        maxFileCount: 3, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount:true,
        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
        allowedFileTypes: ['image'],//配置允许文件上传的类型
        allowedPreviewTypes : [ 'image' ],//配置所有的被预览文件类型
        allowedPreviewMimeTypes : [ 'jpg', 'png', 'gif' ],//控制被预览的所有mime类型
        language : 'zh'
    })
    //异步上传返回结果处理
    $('.myfile').on('fileerror', function(event, data, msg) {
        console.log("fileerror");
        console.log(data);
    });
    //异步上传返回结果处理
    $(".myfile").on("fileuploaded", function (event, data, previewId, index) {
        console.log("fileuploaded");
        var ref=$(this).attr("data-ref");
        $("input[name='"+ref+"']").val(data.response.imgUrl);
    });

    //同步上传错误处理
    $('.myfile').on('filebatchuploaderror', function(event, data, msg) {
        console.log("filebatchuploaderror");
        console.log(data);
    });

    //同步上传返回结果处理
    $(".myfile").on("filebatchuploadsuccess", function (event, data, previewId, index) {
        console.log("filebatchuploadsuccess");
        console.log(data);
    });

    //上传前
    $('.myfile').on('filepreupload', function(event, data, previewId, index) {
        console.log("filepreupload");
    });
    //估值计算方法
    //y=-327.469+(-59.99)*years+11.73*voltage+59.114*batteryHealth+
    //30.116*numBrokenParts+(-110.804)*size+34.695*overallHealth+(-172.611)*brand_2+20.938*brand_3+190.453*brand_4+148.979*brand_5
    function getEvaluation(){
    	var result =0;
    	var brand =$("#brand").val();
    	var years =$("#years").val();
    	var voltage =$("#voltage").val();
    	var size =$("#size").val();
    	var overallHealth =$("#overallHealth").val();
    	var numBrokenParts =$("#numBrokenParts").val();
    	var batteryHealth =$("#batteryHealth").val();
    	result = -7.196+(-39.391)*years+7.165*voltage+21.736*overallHealth+23.153*batteryHealth+(-10.047)*numBrokenParts+59.508*size;
    	if(brand==2){
    		result = result + 66.598;
    	}else if(brand==3){
    		result = result + 70.338;
    	}else if(brand==4){
    		result = result + 186.803;
    	}else if(brand==5){
    		result = result + 202.796;
    	}
    	$("#realPrice").val(result);
    	return result;
    }
</script>
</body>
</html>