document.cookie = "userName"+"=skylark";//测试代码
function getCookie(name){
    var arr = document.cookie.split("; ");
    for(var i=0; i<arr.length; i++){
        var arr2 = arr[i].split("=");
        if(arr2[0] == name){
            return arr2[1];
        }
    }
    return "";
}
var name=getCookie("userName");
var siteNavHTML = '<div class="site-nav">'+
          '<div class="container">'+
            '<ul class="site-nav-r fr">'+
              '<li>您好, <span>'+name+'</span></li>'+
            '</ul>'+
          '</div>'+
        '</div>';

document.write(siteNavHTML);