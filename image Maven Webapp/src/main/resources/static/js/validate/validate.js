/**
 * 
 */
 $(function(){
    //页面加载完成之后执行
	$("#imgVerify").click();
});
//获取验证码
function getVerify(obj){
   obj.src = "/getCode?"+Math.random();
}
function toValidate(){
	$.ajax({
	    type:"post",
	    url:"/validate",
	    async:false,
	    data:{"validateCode":$("#verify_input").val()},
	    success:function(data){
	    	alert(data);
	    }
	});
}