<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Ajout un déscompte</title>

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
<link rel="stylesheet" href="css/separate/vendor/pnotify.min.css">
<link rel="stylesheet" href="css/separate/elements/steps.min.css">
<link rel="stylesheet" href="css/lib/font-awesome/font-awesome.min.css">
<link rel="stylesheet" href="css/lib/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">

</head>

<body class="with-side-menu">

	<%@include file="header-Liste.jsp"%>



	<form action="ajouter-dec.jsp" method="GET">

		<div class="page-content">
			<div class="container-fluid">
				<div class="row">


					<div class="col-xl-10">
						<section class="box-typical steps-icon-block">
							<div class="steps-icon-progress">
								<ul>
									<li class="active">
										<div class="icon">
											<i class="font-icon font-icon-cart-2"></i>
										</div>
										<div class="caption">Nouveau Projet</div>
									</li>
									<li class="active">
										<div class="icon">
											<i class="font-icon font-icon-pin-2"></i>
										</div>
										<div class="caption">Nouveaux Marche</div>
									</li>
									<li class="active">
										<div class="icon">
											<i class="font-icon font-icon-card"></i>
										</div>
										<div class="caption">Nouveaux attachements</div>
									</li>
									<li>
										<div class="icon">
											<i class="font-icon font-icon-check-bird"></i>
										</div>
										<div class="caption">Confirmer</div>
									</li>
								</ul>
							</div>

							<header class="steps-numeric-title">Ajouter attachements</header>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Id" name="Id"/>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Intitule" name="intitule"/>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Unite" name="Unite"/>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Quantite" name="Quantite"/>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="PrixU" name="PrixU"/>
							</div>
							<div class="form-group">
								<input type="submit" value="Ajouter"
									class="btn btn-rounded btn-inline"> <a href=""
									class="btn btn-rounded btn-inline ">Confirmer</a>
							</div>
						</section>
						<!--.steps-icon-block-->
					</div>
				</div>
				<!--.row-->
			</div>
			<!--.container-fluid-->
		</div>



	</form>




	<script src="js/lib/bootstrap-sweetalert/sweetalert.min.js"></script>
	<script src="js/lib/jquery/jquery-3.2.1.min.js"></script>
	<script src="js/lib/popper/popper.min.js"></script>
	<script src="js/lib/tether/tether.min.js"></script>
	<script src="js/lib/bootstrap/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>

	<script src="js/lib/notie/notie.js"></script>
	<script src="js/lib/notie/notie-init.js"></script>
	<script src="js/lib/pnotify/pnotify.js"></script>
	<script src="js/lib/pnotify/pnotify-init.js"></script>
	<script src="js/lib/bootstrap-notify/bootstrap-notify.min.js"></script>
	<script src="js/lib/bootstrap-notify/bootstrap-notify-init.js"></script>

	<script src="js/app.js"></script>
</body>
</html>