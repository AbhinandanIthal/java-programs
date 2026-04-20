<%--  Construct a Cookie Management program using JSP to get the fields  Name, Domain and Max Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then it has to go to show the active cookie list when you press the link go to the active cookie list 


 --%>
<%@ page import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    String ageStr = request.getParameter("age");

    int age = Integer.parseInt(ageStr);

    // Create cookie
    Cookie cookie = new Cookie(name, domain);

    // Set expiry
    cookie.setMaxAge(age);

    // Add cookie
    response.addCookie(cookie);
%>

<h2 style="color:green;">Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Expiry Age:</b> <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>
