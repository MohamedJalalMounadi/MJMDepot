<%@page import="org.apache.catalina.ha.backend.Sender"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%
	/*if(session.getAttribute("Login")==null){
	      response.sendRedirect("sign-in.jsp");
	}else*/
%>
<body class="with-side-menu-addl-full">

	<header class="site-header">
		<div class="container-fluid">
			<a href="#" class="site-logo"> <img class="hidden-md-down"
				src="img/logo-E.png" alt=""> <img class="hidden-lg-down"
				src="img/logo-E.png" alt="">
			</a>


			<div class="site-header-content">
				<div class="site-header-content-in">
					<a class="btn btn-nav btn-rounded btn-inline btn-warning-outline"
						href="ListeProjets.jsp"> Liste projet </a> <a
						class="btn btn-nav btn-rounded btn-inline btn-warning-outline"
						href="ajouter-projet.jsp"> Ajouter Projet </a>    

					<div class="site-header-shown">






						<div class="dropdown user-menu">
							<button class="dropdown-toggle" id="dd-user-menu" type="button"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">
								<img src="img/avatar-2-64.png" alt="">
							</button>
							<div class="dropdown-menu dropdown-menu-right"
								aria-labelledby="dd-user-menu">
								<a class="dropdown-item" href="#"><span
									class="font-icon glyphicon glyphicon-user"></span><%=session.getAttribute("Login")%></a>
								<a class="dropdown-item" href="#"><span
									class="font-icon glyphicon glyphicon-cog"></span>Settings</a> <a
									class="dropdown-item" href="#"><span
									class="font-icon glyphicon glyphicon-question-sign"></span>Help</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="sign-in.jsp"><span
									class="font-icon glyphicon glyphicon-log-out"></span>Logout</a>
							</div>
						</div>



					</div>
					<!--.site-header-shown-->


					<!--.site-header-collapsed-->
				</div>
				<!--site-header-content-in-->
			</div>
			<!--.site-header-content-->
		</div>
		<!--.container-fluid-->
	</header>
<body>

</body>
</html>