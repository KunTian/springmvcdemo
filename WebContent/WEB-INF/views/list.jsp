<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表页面</title>
<link href="../css/jquery.dataTables.min.css" rel="stylesheet">
<script src="../js/jquery-3.2.1.min.js"></script>
<script src="../js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready( function (){
	    $('#personTable').DataTable();
	});
</script>
</head>
<body>
	<table id="personTable">
		<thead>
			<tr>
				<th>人物标识</th>
				<th>姓名</th>
				<th>国别</th>
			</tr>
		</thead>
		<tbody>	
			<c:forEach items = "${personList}" var = "person">
				<tr>
					<td>${person.id }</td>
					<td>${person.fullName }</td>
					<td>${person.country }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>