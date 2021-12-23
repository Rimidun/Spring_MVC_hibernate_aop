<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Hero, Please enter your details</h2>

<br>
<br>
<form:form action ="saveHeroesDota" modelAttribute="heroes">
Name <form:input path="name"/>
<form:errors path="name" cssStyle="color: #ff0000;"/>
<br>
<br>
Race <form:input path="race"/>
<form:errors path="race" cssStyle="color: #ff0000;"/>
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
<br>
<input type="submit" value="OK"/>

</form:form>



</body>

</html>