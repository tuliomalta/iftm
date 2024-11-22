var user = document.getElementById("user");
var pwd = document.getElementById("pwd");

user.innerHTML = window.localStorage.getItem("user");
pwd.innerHTML = window.localStorage.getItem("pwd");