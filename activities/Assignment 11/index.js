var alertFunction = () => {
    var password = document.getElementById("password1");
var passsword1 = document.getElementById("password2");

if(password.value == passsword1.value){
    alert("password changed succesfully!!")
}
else if(passsword1.value == null && passsword.value == null){
    alert("email and password fields are empty")
}
else{
    alert("password values are not same!!")
}
}

