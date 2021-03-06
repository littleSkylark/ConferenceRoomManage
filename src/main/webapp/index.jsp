<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="webkit" name="renderer">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/common.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css">
    <script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
</head>

<body>

<div class="index-nav">
    <div class="container">
        <div class="index-logo">
            <a href="#" class=""><img src="<%=basePath%>img/logo-index.png"></a>
        </div>
        <div class="index-nav-list">
            <a href="#" class="">首页</a>
            <a href="#" >关于关爱通</a>
            <a href="#" >新闻</a>
            <a href="#" >我们的队伍</a>
        </div>
        <div class="m-btn-group fr">
            <a href="#" class="u-btn u-btn-primary">注册</a>
            <a href="javascript:" class="u-btn" onclick="login()">登录</a>
        </div>
    </div>
</div>
<div class="banner-wrap">
    <div class="slider-box">
        <ul class="slider">
            <li><a href="#"><img src="<%=basePath%>img/banner1.jpg"></a></li>
            <li><a href="#"><img src="<%=basePath%>img/banner2.jpg"></a></li>
            <li><a href="#"><img src="<%=basePath%>img/banner3.jpg"></a></li>
        </ul>
    </div>
</div>
<div class="container wrap">
    <ul>
        <li class="company-details clearfix">
            <div class="fl"><img src="<%=basePath%>img/Bitmap1.jpg" height="300" width="490"></div>
            <div class="details-txt fr">
                <h1>智能会议</h1>
                <p class="f16 lh26">简单、轻松、 高效，直观，帮您提高会议组织效率，智能管理会议室资源。</p>
            </div>
        </li>
        <li class="company-details clearfix">
            <div class="fr"><img src="<%=basePath%>img/Bitmap2.jpg" height="300" width="490"></div>
            <div class="details-txt fl">
                <h1>真正的节省时间</h1>
                <p class="f16 lh26">预定页面即时显示会议室供应情况，让您马上了解会议室使用状态。<br>用户可以预订只需轻松点击一间会议室。</p>
            </div>
        </li>
    </ul>
</div>
<div class="footer-img"></div>

<div class="layer-con">
    <div class="popupLayer">
        <div class="pop-hd">
            <h2 class="f20 fn tc">关爱通账号</h2>
        </div>
        <div class="pop-bd ml20 mr20">
            <p>账号</p>
            <div class="mb20 pr">
                <input type="text" class="u-txt lg" placeholder="手机 / 邮箱" style="width:338px;">
            </div>
            <p>密码</p>
            <div class="mb20 pr">
                <input type="text" class="u-txt lg" placeholder="请输入登录密码" style="width:338px;">
            </div>
            <div class="clearfix mb20">
                <label class="u-checkbox fr"><input type="checkbox"><i class="ico"></i>7天内免登录</label>
            </div>
            <a href="#" class="u-btn u-btn-primary lg lw">登录</a>
            <p class="clearfix mt6">
                <a href="#" class="fl">忘记密码？</a>
                <a href="#" class="fr">去注册</a>
            </p>
        </div>
        <div class="pop-ft tc">
        </div>
        <a href="javascript:" class="u-pop-close close">&#xe600;</a>
    </div>
</div>
<!-- footer start -->
<script type="text/javascript" src="<%=basePath%>temp/footer.js"></script>
<!-- footer end -->
<!--[if lt IE 9]>
<script src="<%=basePath%>js/placeholder.js"></script>
<![endif]-->
</body>
<script src="<%=basePath%>js/jquery.bxslider.js" ></script>
<script src="<%=basePath%>js/page.js"></script>
<script>
    $(function(){
        $('.slider').bxSlider({
            infiniteLoop: true,
            hideControlOnEnd:true,
            controls:false,
            auto:true,
            autoHover:true,
            pause:6000
        });
        if($(this).scrollTop()!=0){
            $('.index-nav').addClass('fixed');
            $('.index-logo img').attr({src:'<%=basePath%>img/logo.png'});
            $('.u-btn:eq(1)').addClass('u-btn-default');
        }
        $(window).scroll(function(){
            if($(this).scrollTop()==0){
                $('.index-nav').removeClass('fixed');
                $('.index-logo img').attr({src:'<%=basePath%>img/logo-index.png'});
                $('.u-btn:eq(1)').removeClass('u-btn-default');
            }else{
                $('.index-nav').addClass('fixed');
                $('.index-logo img').attr({src:'<%=basePath%>img/logo.png'});
                $('.u-btn:eq(1)').addClass('u-btn-default');
            }
        });
        $('.u-checkbox').checkbox();
    });
    //弹出层-登录
    function login(){
        dialog.init({
            'w':440,
            'h':464
        })
    }
</script>
</html>