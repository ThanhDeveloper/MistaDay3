function CheckLogin(){
	 var user=document.getElementById("username").value;
	 var pass=document.getElementById("password").value;
	
	 if(user=="admin" && pass=="12345"){
	 	alert('Login successfull! Welcome '+user);
	 }
	 else{
	 	alert('Login failed!!!');
	 }
}