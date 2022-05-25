$(document).ready(function() {
	
	
	
	$("#send").on("click", function() {
	
		var data = {
			username:$("#uname").val(),
			password:$("#pswrd").val(),
		};
		
		$.ajax({
		
			url:"http://localhost:8088/api/auth/signin",
			method:"POST",
			contentType:"application/json",
			data:JSON.stringify(data),
			success:function(data, request) {
				alert("all went well")
                console.log(data)
                console.log(request.responseText())
			},
			error:function(data, request) {
				alert("Etwas hat nicht geklappt!");
                console.log(data)
                console.log(request.responseText())
			}
		});
	});
	
	
	
})
