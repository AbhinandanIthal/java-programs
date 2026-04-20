<%--  Build a Session Management using JSP program for getting  session expiry time and your name through text box and press submit to display the message by greeting Hello your name!.
press the following link to check it within  the set session time  or wait there for the minutes set  to see the session expiry
 --%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>
<html>
<head>
    <title>Session Created</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    int minutes = Integer.parseInt(timeStr);

    // 🔥 Set session expiry (convert minutes → seconds)
    session.setMaxInactiveInterval(minutes * 60);

    // Store name in session
    session.setAttribute("user", name);
%>

<h2 style="color:green;">Session Created Successfully!</h2>

<p>Hello <%= name %>!</p>
<p>Session will expire in <%= minutes %> minute(s)</p>

<br>
<a href="checkSession.jsp">Click here to check session</a>

</body>
</html>
