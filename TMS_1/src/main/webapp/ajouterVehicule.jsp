<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un véhicule</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%@include file="dashboard.jsp" %>
    <div class="home-content">
    <h2>Ajouter une véhicule</h2>
        <div class="overview-boxes">
            
                
                <form action="saveVehicule.do" method="post">
                    <div class="input-field">
                        <label for="immatriculation">Immatriculation</label>
                        <input type="text" name="immatriculation" id="immatriculation" required>
                    </div>
                    <div class="input-field">
                        <label for="modele">Modèle</label>
                        <input type="text" name="modele" id="modele" required>
                    </div>
                    <div class="input-field">
                        <label for="couleur">Couleur</label>
                        <input type="text" name="couleur" id="couleur" required>
                    </div>
                    <div class="input-field">
                        <label for="annee">Année</label>
                        <input type="number" name="annee" id="annee" required>
                    </div>
                    <div class="input-field">
                        <label for="statut">Statut</label>
                        <select name="statut" id="statut" required>
                            <option value="disponible">Disponible</option>
                            <option value="en utilisation">En utilisation</option>
                            <option value="en maintenance">En maintenance</option>
                            <option value="indisponible">Indisponible</option>
                        </select>
                    </div>
                    <div class="input-field">
                        <label for="derniereMaintenance">Dernière Maintenance</label>
                        <input type="date" name="derniereMaintenance" id="derniereMaintenance" required>
                    </div>
                    <div class="input-field">
                        <label for="capacite">Capacité</label>
                        <input type="number" name="capacite" id="capacite" required>
                    </div>
                    <div class="submit reset">
                        <input type="reset" value="Annuler">
                        <input type="submit" value="Ajouter">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
