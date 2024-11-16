<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chercher article</title>
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
    <h2>chercher une véhicule</h2>
        <div class="overview-boxes">
   		<form action="chercher.do" method="get">
                    <div class="input-field">
                        <label for="id">Entrer l'immatriculation de la voiture</label>
                        <input type="text" name="motCle" value="${model.motCle}" placeholder="Rechercher un article..." required>
                    </div>
                    <button type="submit">Chercher</button>
    					</form>
    <table>
    <tr>
    <th>ID</th>
	                            <th>Immatriculation</th>
	                            <th>Modèle</th>
	                            <th>Couleur</th>
	                            <th>Année</th>
	                            <th>Statut</th>
	                            <th>Dernière maintenance</th>
	                            <th>Capacité</th>
	                            <th>Actions</th>
    </tr>
    <c:forEach items="${model.vehicules}" var="v">
    	<tr>
    		<th>${v.idVehicule}</th>
    		<th>${v.immatriculation}</th>
    		<th>${v.modele}</th>
    		<th>${v.couleur}</th>
    		<th>${v.annee}</th>
    		<th>${v.statut}</th>
    		<th>${v.derniereMaintenance}</th>
    		<th>${v.capacite}</th>
    		<th><a href="supprimerVehicule.do?id=${v.idVehicule}">Supprimer</a></th>
    		<th><a href="editerVehicule.do?id=${v.idVehicule}">Edit</a></th>
    	</tr>
    </c:forEach>
    </table>
</div>
</div>
</div>


</body>
</html>