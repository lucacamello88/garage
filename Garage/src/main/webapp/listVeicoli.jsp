<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Veicoli</title>
<link href="<c:url value='/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/css/app.css' />" rel="stylesheet"></link>
<script src="js/sorttable.js"></script>
</head>
<body>
	<div class="generic-container">
		<div class="panel panel-default media">
			<div class="panel-heading">
				<div class="media-left">
					<img src="https://lh4.ggpht.com/abxUwjG1zZsOn0WnMHENcaw_AXaHlVXKhLqLTi-3fZ6exJt2gIFmL5CfRAJcFR-wEA=w300" class="media-object" style="width:50px">
				</div>
				<div class="media-body">
				<span class="lead" >MyVeicoli</span>
				<a href="logout" style="float: right; margin-top: 17px;">${user.username} - Logout</a>
				</div>
			</div>
			<div class="table-responsive">
				<table class="table table-striped table-hover sortable">
					<thead>
						<tr>
							<th style="width: 3%"> <a data-toggle="tooltip" title="Click me!">#</a></th>
							<th style="width: 20%"><a data-toggle="tooltip" title="Click me!">Targa</a></th>
							<th style="width: 20%"><a data-toggle="tooltip" title="Click me!">Marca</a></th>
							<th style="width: 20%"><a data-toggle="tooltip" title="Click me!">Modello</a></th>
							<th style="width: 20%"><a data-toggle="tooltip" title="Click me!">CostoOrario</a></th>
							<th style="width: 15%"><a data-toggle="tooltip" title="Click me!">Azioni</a></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="contact" items="${list}" varStatus="status">
							<tr>
								<td>${status.index +1}</td>
								<td>${veicolo.targa}</td>
								<td>${veicolo.marca}</td>
								<td>${veicolo.modello}</td>
								<td>${veicolo.costoorario}</td>
								<td><a href="updateVeicolo?id=${veicolo.id}">Modifica</a>
									| <a href="remuveVeicolo?id=${veicolo.id}"
									onclick="return confirm('Sicuro di voler eliminare ${veicolo.targa} ${veicolo.marca}?')">Cancella</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="well">
			<a href="addContact">Aggiungi nuovo veicolo</a>
		</div>
	</div>

</body>
</html>