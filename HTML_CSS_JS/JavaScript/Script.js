	
	function Result( a, b){
		
		return a*b;

	}	
	
	function hello(){
			alert( "'Hello Baby :v");
			var x=Result(3,4);
			alert(x);
		}
	function msg(){
		var v =confirm("Are you sure"); //Nó sẽ hiển thị hộp thoại cảnh báo. Nó có thông báo và nút ok.
		if(v=true){
			alert("Ok");
		}
		else{
			alert("Cancel");
		}
	}

	 function msgPrompt() {
        var v = prompt("Who are you?");//Hiển thị hộp thoại để nhận dữ liệu nhập từ người dùng.
        alert("I am " + v);
 
    }
    var newPage;
    function openPage() {
        newPage = window.open("");//Nó mở một trang web trong một cửa sổ mới.
    }


    function openPage() {  // Nó đóng 1 trang web 
        newPage = open("");
    }
    function closePage() {
        newPage.close();
    }

    function SetTimeOut(){ //nó settime out  1s=1000mls
    	setTimeout(function(){
    		alert("Hello alter 2 seconds")
    	},2000);

    }
    function Display(){
    	var name=document.form1.name.value;
    	alert("Welcome "+ name);
    }
    function getCube(){
    	var number=document.getElementById("number").value;
    	alert(number*number*number);
    }


