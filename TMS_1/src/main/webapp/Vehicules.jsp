<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="entities.Vehicule" %>
<%@ page import="dao.VehiculeDaoImpl" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des véhicules</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
                    <h2>Liste des véhicules</h2>
       
            

                <table border="1" cellspacing="0" cellpadding="5">
                    <thead>
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
                    </thead>
                    <tbody>
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
                    </tbody>
                </table>
                <br>
                <a href="saisie.do">Ajouter un nouveau véhicule</a>
            </div>
        </div>
    </div>
</body>
</html>
