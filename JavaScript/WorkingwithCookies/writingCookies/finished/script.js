window.onload = nameFieldInit;

function nameFieldInit() {
	if (document.cookie != "") {
		document.getElementById("nameField").innerHTML = "Hello, " + document.cookie.split("=")[1];
	}
}
