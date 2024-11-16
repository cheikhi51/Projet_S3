<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entities.Demande" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Confirmation de Demande</title>
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
        <h2>La demande a été ajoutée avec succès</h2>
       
        <table border="1" cellspacing="0" cellpadding="5">
            <thead>
                <tr>
                    <th>Numéro de Demande</th>
                    <th>Date de Demande</th>
                    <th>Adresse de Livraison</th>
                    <th>Ville</th>
                    <th>Code Postal</th>
                    <th>Pays</th>
                    <th>Date de Livraison</th>
                    <th>Statut</th>
                    <th>Commentaire</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${demande.numeroDemande}</td>
                    <td>${demande.dateDemande}</td>
                    <td>${demande.adresseLivraison}</td>
                    <td>${demande.ville}</td>
                    <td>${demande.codePostal}</td>
                    <td>${demande.pays}</td>
                    <td>${demande.dateLivraison}</td>
                    <td>${demande.statut}</td>
                    <td>${demande.commentaire}</td>
                </tr>
            </tbody>
        </table>
        <br>
        <a href="saisie.demande">Ajouter une nouvelle demande</a>
    </div>

</body>
</html>
