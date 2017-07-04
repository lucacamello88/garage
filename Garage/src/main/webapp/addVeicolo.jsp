<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi Veicolo</title>
</head>
<body>

<div class="container">
		<div class="page-header">
			<h1>Aggiungi contatto</h1>
		</div>

		<form method="post" action="addVeicolo">
			<div class="form-group">
			<label for="email">Targa:</label>
				<input class="form-control" type="text" name="targa"
					placeholder="Inserisci targa" required /><br> 
			<label for="email">Marca:</label>
				<input class="form-control" type="text" name="marca"
					placeholder="Inserisci marca" required /><br> 
			<label for="email">Modello:</label>
				<input class="form-control" type="text" name="modello" 
					placeholder="Inserisci modello" required /><br> 
			<label for="email">CostoOrario:</label>
				<input class="form-control" type="number" name="costoorario"
					placeholder="Inserisci costoorario" required /><br>
			</div>
			<input class="btn btn-info" type="submit" value="Salva" style="float: right; margin"/>
			<a href="listContacts" class="btn btn-danger" style="float: right; margin-right: 15px"> Cancel </a>
		</form>
		<br>
	</div>

</body>
</html>