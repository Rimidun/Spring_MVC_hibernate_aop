<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Hero, Please enter your details</h2>
<br>
<br>
<form:form action ="saveHeroesDota" modelAttribute="heroes">
<form:hidden path="id"/>
Name <form:input path="name"/>
<br>
<br>
Race <form:input path="race"/>
<br>
<br>
Attribute <form:select path="attribute">
<form:option value="Power" label="Power"/>
<form:option value="Agility" label="Agility"/>
<form:option value="Intelligence" label="Intelligence"/>
</form:select>
<br>
<br>
Damage <form:input path="damage"/>
<br>
<br>
<input type="submit" value="OK"/>

</form:form>



</body>

</html>