<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Liste des projets</title>
<%@ page import=" com.Projet.DAO.*"%>
<%@ page import=" com.Projet.model.*"%>
<%@ page import=" java.util.*"%>
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
							<h2><b>Liste des projets</b></h2>
						</div>
					</div>
				</div>
			</header>
			<section class="card" style="right: 200px">
				<div class="card-block">
					<table id="example"
						class="display table table-striped table-bordered" cellspacing="0"
						width="100%">
						<thead>
							<tr>
								<th><center>id</center></th>
								<th><center>intitule</center></th>
									<th><center>Devis</center></th>
									<th><center>Marche</center></th>
								<th><center>action</center></th>

							</tr>
						</thead>

						<tbody>
							<%
								ProjetDao PD = new ProjetDao();
								List<Projet> list = new ArrayList<Projet>();
								list = PD.getAllProjet();
								for (int i = 0; i < list.size(); i++) {
									System.out.println(list.get(i).getIntitule());
							%>
							<tr>
								<td align=center>
								<%=list.get(i).getIdentifiant()%>	
									</td>

								<td align=center><%=list.get(i).getIntitule()%></td>
								<td align=center> <a href="ListeDevis.jsp?identif=<%=list.get(i).getIdentifiant()%>">Devis</a> 
								<a type="button" class="btn btn-inline btn-secondary-outline" href="Recherchecontroller?modif=Devi&identif=<%=list.get(i).getId()%>">+</a></td>
								<td align=center> <a href="ListeMarches.jsp?identif=<%=list.get(i).getIdentifiant()%>">Marche</a> 

								<td align=center>
									
										<div class="btn-group" role="group" aria-label="Basic example">
											<a
												href="Recherchecontroller?modif=false&identif=<%=list.get(i).getId()%>"
												type="button" class="btn btn-default-outline"> <span
												class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
											</a> <a  href="Recherchecontroller?modif=true&identif=<%=list.get(i).getId()%>"type="button" class="btn btn-default-outline"> <span
												class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</a> <a href="Dropcontroller?page=projet&identif=<%=list.get(i).getId()%>"
												type="button" class="btn btn-default-outline"> <span
												class="glyphicon glyphicon-remove" aria-hidden="true"></span></a>

										</div>
									
								</td>

							</tr>
							<%
								}
							%>

						</tbody>
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