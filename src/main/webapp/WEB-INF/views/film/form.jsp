<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Create film</h1>
        <sf:form commandName="film" action="/create">
            <div class="form-group">
                <label for="title">Title:</label>
                <sf:input path="title" class="form-control"/>
            </div>
            <sf:hidden path="id"/>
            <button type="submit" class="btn btn-success">Submit</button>
        </sf:form>
    </div>


  <!-- <form action='/create' method='post'>
    Title: <input type='text' name='product'/>
    <input type='submit' value='send'/>
  </form> -->

</body>
</html>
