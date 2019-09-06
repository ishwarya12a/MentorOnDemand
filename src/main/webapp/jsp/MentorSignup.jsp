<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.mentor.MentorOnDemand.model.Mentor"  pageEncoding="ISO-8859-1"%>
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
<div class="container-fuild">
        <div class="header">
            <h1 style="float:left;">Mentor On Demand</h1>
        </div>
        <form:form class="form-horizontal" method="POST" action="/mentorsignup" modelAttribute="mentor">
            <div class="Absolute-Center is-Responsive">
                <h3 style="margin-left: 100px;">SignUp</h3>
                <div class="form-group">
                    <label class="control-label col-sm-2">Name</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="name" path="name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Address</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="address" path="address"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Email</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="email" path="email"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Mobile Number</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="mobile" path="mobile"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">LinkedIn URL</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="url" path="url"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Experience</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="experience" path="experience"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Technology</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="technology" path="technology"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Slot Time</label>
                    <div class="col-sm-4">
                        <form:input type="text" class="form-control" id="slotTime" path="slotTime"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">Password</label>
                    <div class="col-sm-4">
                        <form:input type="password" class="form-control" id="password" path="password"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </div></form:form>
    </div>
    
    <div class="footer">
        <h3>Copyrights &copy 2019</h3>
    </div>
</body>
</html>