<html>
<body>
<h2><%= "Async demo" %></h2>

<form>
UserName:<input id="uname" type="text" name="uname">
Password:<input id="pwd" type="password" name="pwd">
<button type="button" onclick="login(event)">Login</button>


</form>

<div id="output">

</div>

<script type="text/javascript">
async function login(event) {
    let username = document.getElementById("uname").value;
    let password = document.getElementById("pwd").value;

    let resp = await fetch("Asyncservlet", {
        method: "POST",
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        body: "uname=" + username + "&pwd=" + password
    });

    let text = await resp.text();
    document.getElementById("output").innerHTML = text;
}
</script>



</body>
</html>
