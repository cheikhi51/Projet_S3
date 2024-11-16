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
    <h2>Ajouter un véhicule</h2>
        <div class="overview-boxes">
           
                
                <form action="updateVehicule.do" method="post">
                    <div class="input-field">
                        <label for="id">ID</label>
                        <input type="number" name="id" value="${v.idVehicule}" required>
                    </div>
                    <div class="input-field">
                        <label for="immatriculation">Immatriculation</label>
                        <input type="text" name="immatriculation" value="${v.immatriculation}" required>
                    </div>
                    <div class="input-field">
                        <label for="modele">Modèle</label>
                        <input type="text" name="modele" value="${v.modele}" required>
                    </div>
                    <div class="input-field">
                        <label for="couleur">Couleur</label>
                        <input type="text" name="couleur" value="${v.couleur}"required>
                    </div>
                    <div class="input-field">
                        <label for="annee">Année</label>
                        <input type="number" name="annee" value="${v.annee}"  required>
                    </div>
                    <<div class="input-field">
					    <label for="statut">Statut</label>
					    <select name="statut" required>
					        <option value="disponible" ${v.statut == 'disponible' ? 'selected' : ''}>Disponible</option>
					        <option value="en utilisation" ${v.statut == 'en utilisation' ? 'selected' : ''}>En utilisation</option>
					        <option value="en maintenance" ${v.statut == 'en maintenance' ? 'selected' : ''}>En maintenance</option>
					        <option value="indisponible" ${v.statut == 'indisponible' ? 'selected' : ''}>Indisponible</option>
					    </select>
					</div>

                    <div class="input-field">
                        <label for="derniereMaintenance">Dernière Maintenance</label>
                        <input type="date" name="derniereMaintenance" value="${v.derniereMaintenance}" required>
                    </div>
                    <div class="input-field">
                        <label for="capacite">Capacité</label>
                        <input type="number" name="capacite" value="${v.capacite}" required>
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
