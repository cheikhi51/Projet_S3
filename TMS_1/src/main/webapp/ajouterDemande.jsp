<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter une Demande</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
    <h2>Ajouter une Demande</h2>
        <div class="overview-boxes">
            <form action="save.demande" method="post">
                <div class="input-field">
                    <label for="numero_demande">Numéro de Demande</label>
                    <input type="text" name="numero_demande" id="numero_demande" required>
                </div>
                <div class="input-field">
                    <label for="date_demande">Date de Demande</label>
                    <input type="date" name="date_demande" id="date_demande" required>
                </div>
                <div class="input-field">
                    <label for="adresse_livraison">Adresse de Livraison</label>
                    <input type="text" name="adresse_livraison" id="adresse_livraison" required>
                </div>
                <div class="input-field">
                    <label for="ville">Ville</label>
                    <input type="text" name="ville" id="ville">
                </div>
                <div class="input-field">
                    <label for="code_postal">Code Postal</label>
                    <input type="text" name="code_postal" id="code_postal">
                </div>
                <div class="input-field">
                    <label for="pays">Pays</label>
                    <input type="text" name="pays" id="pays">
                </div>
                <div class="input-field">
                    <label for="date_livraison">Date de Livraison</label>
                    <input type="date" name="date_livraison" id="date_livraison">
                </div>
                <div class="input-field">
                    <label for="statut">Statut</label>
                    <select name="statut" id="statut" required>
                        <option value="en attente">En attente</option>
                        <option value="validée">Validée</option>
                        <option value="annulée">Annulée</option>
                        <option value="complété">Complété</option>
                    </select>
                </div>
                <div class="input-field">
                    <label for="commentaire">Commentaire</label>
                    <textarea name="commentaire" id="commentaire"></textarea>
                </div>
                <div class="submit reset">
                    <input type="reset" value="Annuler">
                    <input type="submit" value="Ajouter">
                </div>
            </form>
        </div>
    </div>
</body>
</html>
