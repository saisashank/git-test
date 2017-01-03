<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>

<head><title>student data</title></head>
<form:form action="processform"  modelAttribute="student">
First name: <form:input  path="firstName"   />
Last name: <form:input  path="lastName"   />


		<form:select path="option">
			<form:option value="SELECT" label="SELECT"/>
			<form:option value="INDIA" label="INDIA"/>
			<form:option value="USA" label="USA"/>
			<form:option value="EUROPE" label="EUROPE"/>
					
		
		
		
		</form:select>
JAVA <form:checkbox path="favlang" value="JAVA" />
C# <form:checkbox path="favlang" value="C#" />
SCALA <form:checkbox path="favlang" value="SCALA" />
HADOOP <form:checkbox path="favlang" value="HADOOP" />
		
<input type="submit" value="submit">



</form:form>
<body>


</body>
</html>








