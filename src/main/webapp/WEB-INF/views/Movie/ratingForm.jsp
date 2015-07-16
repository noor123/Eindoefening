<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <f:loadBundle basename="com.rd.resources.Messages" var="msgs" />
</head>
<body>
    <div class="container">
        <h1 class="text-center">Give a rating</h1>
        <p class="text-center">What do you find of this movie?</p>
        <sf:form commandName="movie" action="/rating_done">
            <div class="form-group">
                username:<br><input type="text" name="username" class="form-control" required><br>
                password:<br><input type="password" name="password" class="form-control" required><br>
                Title: <br>
                    <select name="movie_title" class="form-control">
                        <c:forEach var="m" items="${movies}">
                            <option>${m.title}</option>
                        </c:forEach>
                    </select>
                <br>
                <%--<br><sf:input path="title" class="form-control"/><br>--%>
                Rating: <br><input type="number" min="0" max="10" value="5" class="form-control"><br>
                Comment:<br><textarea type="text" name="description" min="0" max="250" class="form-control" required>What is your opinion about this movie?</textarea><br>
            </div>
            <button type="submit" class="btn btn-success">Submit</button>
        </sf:form>
    </div>


  <!-- <form action='/create' method='post'>
    Title: <input type='text' name='product'/>
    <input type='submit' value='send'/>
  </form> -->

</body>
</html>
