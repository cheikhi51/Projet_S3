<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chercher demande</title>
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
    <h2>chercher une demande</h2>
        <div class="overview-boxes">
   		<form action="chercher.demande" method="get">
                    <div class="input-field">
                        <label for="id">Entrer la ville des demandes</label>
                        <input type="text" name="motCle" value="${model.motCle}" placeholder="Rechercher un article..." required>
                    </div>
                    <button type="submit">Chercher</button>
    					</form>
    <table>
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
    </table>
</div>
</div>
</div>


</body>
</html>