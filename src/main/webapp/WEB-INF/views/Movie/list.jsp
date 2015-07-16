<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Movies</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/movie.css"/>
</head>
<body>
  <h1 class="text-center">Overview movies</h1>
  <p class="text-center">
      These are the movies in our database. You can rate them if you want.
  </p>
  <table id=tableMovies border="1">
      <tr>
          <th>Title</th>
          <th>Average rating</th>
      </tr>
      <c:forEach var="movie" items="${movies}">
          <tr>
              <td>${movie.title}</td>
              <td>${movie.calculateRating()}% </td>
              <td>
                  <a class="btn btn-primary" href="/detail?id=${movie.id}">Detailpage</a>
                  <a class="btn btn-primary" href="/rating?id=${movie.id}">Rate it yourself</a>
              </td>
          </tr
      </c:forEach>
  </table>
</body>
</html>
