<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		
		<script>
			window.menu = '${title}';
		</script>
		
		<title>Online Shopping -${title}</title>
		
		<!-- Bootstrap core CSS -->
		<link href="${css}/bootstrap.css" rel="stylesheet">
		<!-- Add custom CSS here -->
		<link href="${css}/shop-homepage.css" rel="stylesheet">
		<!-- Add custom CSS here -->
		<link href="${css}/myapp.css" rel="stylesheet">
		<!-- Boostrap Yeti Theme -->
		<!-- <link href="${css}/bootstrap-yeti-theme.css" rel="stylesheet">  -->

</head>

<body>
	<div class="wrapper">
		<!-- Navigation Bar -->
		<%@include file="./shared/navbar.jsp"%>"

		<!-- Page Content -->
		<!-- home.jsp -->
		<div class="content">
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>



			<!-- Load only when user click on about  -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load only when user click on contact  -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
		</div>





		<!-- footer -->
		<%@include file="./shared/footer.jsp"%>
		<!-- /.container -->

		<!-- JavaScript -->
		<script src="${js}/jquery-1.10.2.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<!-- Self coded js -->
		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
