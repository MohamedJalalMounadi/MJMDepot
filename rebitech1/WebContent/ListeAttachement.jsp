<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Liste des attachements</title>

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
<link rel="stylesheet" href="css/lib/datatables-net/datatables.min.css">
<link rel="stylesheet" href="css/separate/vendor/datatables-net.min.css">
<link rel="stylesheet" href="css/lib/font-awesome/font-awesome.min.css">
<link rel="stylesheet" href="css/lib/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="with-side-menu-addl-full">

	<%@include file="header-Liste.jsp"%>

	<div class="page-content">
		<div class="container-fluid">
			<header class="section-header">
				<div class="tbl">
					<div class="tbl-row">
						<div class="tbl-cell">
							<h2>Attachement du march�s " Nom march�s "</h2>
						</div>
					</div>
				</div>
			</header>
			<section class="card" style="right: 200px">
				<div class="card-block">
					<table id="example"
						class="display table table-striped table-bordered" cellspacing="0"
						width="100%">
						<tr>
							<th rowspan="2">Article</th>
							<th rowspan="2">Unit�</th>
							<th colspan="3"><center>A</center></th>
							<th colspan="3"><center>B</center></th>
							<th colspan="3"><center>C</center></th>
							<th rowspan="2">Montant</th>
						</tr>
						<tr>
							<th>Qte M</th>
							<th>C Qte</th>
							<th>Qte</th>
							<th>Qte M</th>
							<th>C Qte</th>
							<th>Qte</th>
							<th>Qte M</th>
							<th>C Qte</th>
							<th>Qte</th>
							
						</tr>
						<tr>
							<td>Nom Article</td>
							<td>Unit�</td>
							<td>55</td>
							<td>10</td>
							<td>50</td>
							<td>20</td>
							<td>20</td>
							<td>20</td>
							<td>20</td>
							<td>20</td>
							<td>20</td>
							<td>150</td>
						</tr>
					</table>
				</div>
			</section>
		</div>
		<!--.container-fluid-->
	</div>
	<!--.page-content-->

	<script src="js/lib/jquery/jquery-3.2.1.min.js"></script>
	<script src="js/lib/popper/popper.min.js"></script>
	<script src="js/lib/tether/tether.min.js"></script>
	<script src="js/lib/bootstrap/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>

	<script src="js/lib/datatables-net/datatables.min.js"></script>
	<script>
		$(function() {
			$('#example').DataTable();
		});
	</script>

	<script src="js/app.js"></script>
</body>
</html>