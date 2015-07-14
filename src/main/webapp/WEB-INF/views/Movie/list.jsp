<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Movies</title>
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
    <c:forEach var="movie" items="${movies}">
      <tr>
        <td><a href="/movie?id=${movie.id}">${movie.id}</a></td>
        <td><a href="/movie?id=${movie.id}">${movie.title}</a></td>
      </tr
    </c:forEach>
  </table>
</body>
</html>
