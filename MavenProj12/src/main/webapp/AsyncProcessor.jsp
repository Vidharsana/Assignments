<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form>
        Enter Text: <input id="text" type="text" name="text">
        <button type="button" onclick="processText()">Submit</button>
    </form>

    <div id="output"></div>

    <script type="text/javascript">
    async function processText() {
        let text = document.getElementById("text").value;

        let resp = await fetch("AsynString", {
            method: "POST",
            headers: { "Content-Type": "application/x-www-form-urlencoded" },
            body: "text=" + text
        });

        let r = await resp.text();
        document.getElementById("output").innerHTML = r;
    }
    </script>


</body>
</html>