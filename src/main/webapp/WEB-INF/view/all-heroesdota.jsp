<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>All Heroes in Dota 2</h2>
<br>

<table cellspacing="5" cellpadding="5">
<tr>

<th>Name</th>

<th>Race</th>
<th>Attribute</th>
<th>Damage</th>

</tr>


<c:forEach var="heroes" items="${allHeroes}">

<tr>

<td>${heroes.name}</td>
<td>${heroes.race}</td>
<td>${heroes.attribute}</td>
<td>${heroes.damage}</td>

</tr>

</c:forEach>

</table>


</body>

</html>