<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>film</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/detail.css"/>

</head>
<body>
  <div class="container">
      <h1 class="text-center">${movie.title}</h1>
      <p class="extra_space" class="text-center">${movie.summary}</p>
      <p><b>Length: </b>${movie.length} minutes</p>
      <p><b>Director: </b>${movie.director}</p>
      <p><b>Average rating: </b>${movie.calculateRating()}%</p>
      <p><b>Genres: </b>
        <c:forEach var="genre" items="${movie.genres}" varStatus="status">
            ${genre.name}<c:if test="${!status.last}">, </c:if>
        </c:forEach>
      </p>
      <p><b>Actors: </b>
          <c:forEach var="mapEntry" items="${movie.cast}">
            <p>${mapEntry.value.firstName} ${mapEntry.value.lastName} (${mapEntry.key})</p>
          </c:forEach>
      </p>
      <p><b>Comments: </b>
          <c:forEach var="comment" items="${movie.comments}">
      <p>
        ${comment.user.username} says: "${comment.description}"
      </p>
      </c:forEach>
      </p>


  </div>

  <%--@OneToMany Set<Comment> comments = new TreeSet<>();--%>



</body>
</html>
