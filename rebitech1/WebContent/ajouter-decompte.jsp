<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Ajout un decompte</title>
<%
	System.out.println(session.getAttribute("Login"));
%>
<%@ page import=" com.Projet.DAO.*"%>
<%@ page import=" com.Projet.model.*"%>
<%@ page import=" java.util.*"%>
<%@ page import=" java.lang.*"%>
<link href="img/favicon.144x144.png" rel="apple-touch-icon"
	type="image/png" sizes="144x144">
<link href="img/favicon.114x114.png" rel="apple-touch-icon"
	type="image/png" sizes="114x114">
<link href="img/favicon.72x72.png" rel="apple-touch-icon"
	type="image/png" sizes="72x72">
<link href="img/favicon.57x57.png" rel="apple-touch-icon"
	type="image/png">
<link href="img/favicon.png" rel="icon" type="image/png">
<link href="img/favicon.ico" rel="shortcut icon">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
<link rel="stylesheet" href="css/separate/elements/steps.min.css">
<link rel="stylesheet" href="css/lib/font-awesome/font-awesome.min.css">
<link rel="stylesheet" href="css/lib/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>

<body class="with-side-menu">

	<%@include file="header-Liste.jsp"%>
	<%
		HttpSession ses = request.getSession();
		Projet P = (Projet) ses.getAttribute("projet");
	%>
	<form action="Marchecontroller" method="GET">

		<div class="page-content">
			<div class="container-fluid">
				<div class="row">

					<div class="col-xl-10">
						<section class="box-typical steps-icon-block">
							

							<header class="steps-numeric-title">
								Ajouter un decompte du marché :
								<%=P.getIntitule()%></header>

							<div class="form-group">
								<input type="text" class="form-control" placeholder="IdA"
									name="IdA" />
							</div>

							<div class="form-group">
								<input type="text" class="form-control" placeholder="Intitule"
									name="Intitule" />
							</div>

							<div class="form-group">
								<input type="text" class="form-control" placeholder="Unite"
									name="Unite" />
							</div>
							
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Quantite"
									name="Quantite" />
							</div>
							
							<div class="form-group">
								<input type="text" class="form-control" placeholder="PrixU"
									name="PrixU" />
							</div>
							<div class="form-group">
								<input type="submit" value="Ajouter"
									class="btn btn-rounded btn-inline"> <a
									href="ListeProjets.jsp" class="btn btn-rounded btn-inline ">Confirmer</a>
								<a href="ajouter-dec.jsp" class="btn btn-rounded btn-inline ">Suivant</a>
							</div>
						</section>
					</div>
					<!--.row-->
				</div>
				<!--.container-fluid-->
			</div>
		</div>
	</form>
	<script src="js/lib/jquery/jquery-3.2.1.min.js"></script>
	<script src="js/lib/popper/popper.min.js"></script>
	<script src="js/lib/tether/tether.min.js"></script>
	<script src="js/lib/bootstrap/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>

	<script src="js/app.js"></script>
</body>
</html>