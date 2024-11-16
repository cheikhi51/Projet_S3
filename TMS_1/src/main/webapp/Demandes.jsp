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
                    <h2>Liste des demandes</h2>
       
            

                <table border="1" cellspacing="0" cellpadding="5">
                    <thead>
                        <tr>
                        <th>ID</th>
                             <th>Numéro de Demande</th>
                    <th>Date de Demande</th>
                    <th>Adresse de Livraison</th>
                    <th>Ville</th>
                    <th>Code Postal</th>
                    <th>Pays</th>
                    <th>Date de Livraison</th>
                    <th>Statut</th>
                    <th>Commentaire</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${model.demandes}" var="demande">
					    	<tr>
					    	<td>${demande.idDemande}</td>
					    		<td>${demande.numeroDemande}</td>
                    <td>${demande.dateDemande}</td>
                    <td>${demande.adresseLivraison}</td>
                    <td>${demande.ville}</td>
                    <td>${demande.codePostal}</td>
                    <td>${demande.pays}</td>
                    <td>${demande.dateLivraison}</td>
                    <td>${demande.statut}</td>
                    <td>${demande.commentaire}</td>
					    		<th><a href="supprimer.demande?id=${demande.idDemande}">Supprimer</a></th>
					    		<th><a href="editerVehicule.do?id=${demande.idDemande}">Edit</a></th>
					    	</tr>
					    </c:forEach>
                    </tbody>
                </table>
                <br>
                <a href="saisie.demande">Ajouter un nouveau véhicule</a>
            </div>
        </div>
    </div>
</body>
</html>
