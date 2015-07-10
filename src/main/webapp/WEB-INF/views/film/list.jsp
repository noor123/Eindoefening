<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Films</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
  <h1 class="text-center">Table with films</h1>
  <table border="1" class="table-striped">
      <tr>
      <th>id</th>
      <th>title</th>
    </tr>
    <c:forEach var="film" items="${films}">
      <tr>
        <td><a href="/film?id=${film.id}">${film.id}</a></td>
        <td><a href="/film?id=${film.id}">${film.title}</a></td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
