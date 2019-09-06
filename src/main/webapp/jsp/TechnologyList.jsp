<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     import="java.util.*,com.mentor.MentorOnDemand.model.Mentor" pageEncoding="ISO-8859-1"%>
<%@page import="com.mentor.MentorOnDemand.model.User"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Mentor On Demand</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
        integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css"
        integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
        integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
<%
List technologyList=(List)request.getAttribute("technologyList");
System.out.println(technologyList);
%>
<%
User user = (User) session.getAttribute("user");
%>

<div class="container-fuild">
        <div class="header">
            <h1 style="float:left;">Mentor On Demand</h1>
            <h3 style="float:right; margin-right:100px"><a href="#" style="color:white;">Logout</a></h3>
        </div>
        <div class="nav">
            <ul class="nav nav-tabs nav-justified">
                <li><a data-toggle="tab" href="#">Search Training</a></li>
                <li><a data-toggle="tab" href="#">Current Training</a></li>
                <li><a data-toggle="tab" href="#">Completed Training</a></li>
                <li><a data-toggle="tab" href="#">Notification</a></li>
            </ul>
        </div>
        <form class="form-horizontal">
            <div class="Absolute-Center is-Responsive">
                <h3 style="margin-left: 100px;">List of Technology</h3>
            </div>
            <table id="table" class="table table-bordered" cellpadding="10" align="center">
            <tr>
            <th>RegCode</th>
            <th>Name</th>
            <th>Technology</th>
             <th>Experience</th>
              <th>Slot Time</th>
              <th>Action</th>
            </tr>
  <%
 for(int i=0;i<technologyList.size();i++){
Mentor technology=(Mentor)technologyList.get(i);
%>
      <tr>
      <td><%= technology.getRegCode() %></td>
      <td><%= technology.getName() %></td> 
      <td><%= technology.getTechnology() %></td>  
      <td><%= technology.getExperience() %></td>    
      <td><%= technology.getSlotTime() %></td>
      <td>
      <div class="form-group">
    <div class="col-sm-4"><a href="updateStatus?id=<%= technology.getRegCode() %>&userId=<%=user.getRegCode() %>" > 
     <%=technology.getStatus() %></a></div>
      </div>
      </div></td>  
      </tr>
      <% }%>       
            </table>
        </form>
        <div class="footer">
            <h3>Copyrights &copy 2019</h3>
        </div>
    </div>
</body>
</html>