<!DOCTYPE html>
<html>
<head lang="en">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>Liste des devis</title>
<%@ page import=" com.Projet.DAO.*"%>
<%@ page import=" com.Projet.model.*"%>
<%@ page import=" java.util.*"%>
	<link href="img/favicon.144x144.png" rel="apple-touch-icon" type="image/png" sizes="144x144">
	<link href="img/favicon.114x114.png" rel="apple-touch-icon" type="image/png" sizes="114x114">
	<link href="img/favicon.72x72.png" rel="apple-touch-icon" type="image/png" sizes="72x72">
	<link href="img/favicon.57x57.png" rel="apple-touch-icon" type="image/png">
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
<%	System.out.println("ok");
String id = (String) request.getParameter("identif");
System.out.println(id);
ProjetDao PD = new ProjetDao();
Projet P= PD.getProjetByIdentif(id) ;
DevisDao DD = new DevisDao();
List<Devis> list = new ArrayList<Devis>();
list = DD.getDevisbyprojet(P.getId()); %>
	<div class="page-content">
		<div class="container-fluid">
			<header class="section-header">
				<div class="tbl">
					<div class="tbl-row">
						<div class="tbl-cell">
							<h2>Devis du Projet : <%= P.getIntitule() %></h2>
						</div>
					</div>
				</div>
			</header>
			<section class="card" style="right:200px">
				<div class="card-block">
					<table id="example" class="display table table-striped table-bordered" cellspacing="0" width="100%">
						<thead>
						<tr>
							<th><center>id</center></th>
							<th><center>Montant</center></th>
							<th><center>Designation</center></th>
							<th><center>Etat devis</center></th>
							<th><center>action</center></th>
						</tr>
						</thead>
					
						<tbody>
						<%
					
								for (int i = 0; i < list.size(); i++) {
									System.out.println(list.get(i).getDesignationD());
							%>
						<tr>
							<td><%= list.get(i).getIdentifiantD() %></td>
							<td><%= list.get(i).getMontantD() %> DH</td>
							<td><%= list.get(i).getDesignationD() %> </td>
							<td><%= list.get(i).getEtatD() %></td>
							<td align=center>
									
										<div class="btn-group" role="group" aria-label="Basic example">
											
											<a href="Recherchecontroller?modif=modifdevi&identif=<%=P.getId()%>&identifD=<%=list.get(i).getId()%>" type="button" class="btn btn-default-outline">
												<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</a>
											<a href="Dropcontroller?page=devi&identif=<%=list.get(i).getId()  %>" type="button" class="btn btn-default-outline">
												<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
											</a>
										</div>
									
								</td>
						</tr>
						<%} %>
						</tbody>
					</table>
				</div>
			</section>
		</div><!--.container-fluid-->
	</div><!--.page-content-->

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