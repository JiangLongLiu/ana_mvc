 var pathName=window.document.location.pathname;
 var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
/*$(document).ready(function(){  
        var saveDataAry=[];  
        var data1={"userName":"test","address":"gz"};  
        var data2={"userName":"ququ","address":"gr"};  
        saveDataAry.push(data1);  
        saveDataAry.push(data2); 
        var url=projectName+"/user/saveUser";
        $.ajax({ 
            type:"POST", 
            url:url, 
            contentType:"application/json",  //发送信息至服务器时内容编码类型。             
            dataType:"json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
            data:JSON.stringify(saveDataAry), 
            success:function(data){ 
            	console.log("data= ",data);
            	$.each(data,function(i,user){
            		$("#my_tbody").append("<tr><td>"+user.userName+"</td><td>"+user.address+"</td></tr>");
            		});
            } 
         }); 
    });  */

 
 /*点击按钮时 报415 为什么？  Failed to load resource: the server responded with a status of 415 (Unsupported Media Type) */
$("#sendAjaxBtn").on("click",function(){
    var url=projectName+"/user/saveUser";
	$.post(url,{userName:"liujl",passWord:"123332"},function(data){
		$.each(data,function(i,user){
    		$("#my_tbody").append("<tr><td>"+user.userName+"</td><td>"+user.address+"</td></tr>");
    		});
	},"json");
	
});