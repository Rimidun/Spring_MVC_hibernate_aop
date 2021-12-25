<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>All Heroes in Dota 2</h2>
<br>

<table cellspacing="3" cellpadding="3">
<tr>

<th>Name</th>

<th>Race</th>
<th>Attribute</th>
<th>Damage</th>
<th>Operations</th>

</tr>


<c:forEach var="heroes" items="${allHeroes}">

<c:url var="updateButton" value="/updateHeroesDota">
<c:param name="heroesId" value="${heroes.id}"/>
</c:url>

<tr>

<td>${heroes.name}</td>
<td>${heroes.race}</td>
<td>${heroes.attribute}</td>
<td>${heroes.damage}</td>
<td><input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/></td>
<td><input type="button" value="Delete" onclick="window.location.href = '${updateButton}'"/></td>

</tr>

</c:forEach>

</table>

<br>


<input type="button" value="Add" onclick="window.location.href = 'addHeroesDota'"/>
<br>
<br>
</body>

</html>