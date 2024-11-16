package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entities.Vehicule;


public class VehiculeDaoImpl implements IVehiculeDao {

    @Override
    public Vehicule save(Vehicule v) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO vehicules(immatriculation, modele, couleur, annee, statut, derniere_maintenance, capacite) VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, v.getImmatriculation());
            ps.setString(2, v.getModele());
            ps.setString(3, v.getCouleur());
            ps.setInt(4, v.getAnnee());
            ps.setString(5, v.getStatut());
            ps.setDate(6, new java.sql.Date(v.getDerniereMaintenance().getTime()));
            ps.setInt(7, v.getCapacite());
            ps.executeUpdate();
            PreparedStatement ps2=connection.prepareStatement
    				("SELECT MAX(ID) AS MAX_ID FROM vehicules");
    		ResultSet rs=ps2.executeQuery();
    		if(rs.next()) {
    			v.setIdVehicule(rs.getLong("MAX_ID"));
    		}
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    @Override
    public List<Vehicule> vehiculesParMc(String mc) {
        List<Vehicule> vehicules = new ArrayList<>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM vehicules WHERE immatriculation LIKE ?");
            ps.setString(1, mc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vehicule v = new Vehicule();
                v.setIdVehicule(rs.getLong("id_vehicule"));
                v.setImmatriculation(rs.getString("immatriculation"));
                v.setModele(rs.getString("modele"));
                v.setCouleur(rs.getString("couleur"));
                v.setAnnee(rs.getInt("annee"));
                v.setStatut(rs.getString("statut"));
                v.setDerniereMaintenance(rs.getDate("derniere_maintenance"));
                v.setCapacite(rs.getInt("capacite"));
                vehicules.add(v);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicules;
    }
    
    public List<Vehicule> getAllVehicules() {
        List<Vehicule> vehicules = new ArrayList<>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM vehicules");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vehicule v = new Vehicule();
                v.setIdVehicule(rs.getLong("id_vehicule"));
                v.setImmatriculation(rs.getString("immatriculation"));
                v.setModele(rs.getString("modele"));
                v.setCouleur(rs.getString("couleur"));
                v.setAnnee(rs.getInt("annee"));
                v.setStatut(rs.getString("statut"));
                v.setDerniereMaintenance(rs.getDate("derniere_maintenance"));
                v.setCapacite(rs.getInt("capacite"));
                vehicules.add(v);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicules;
    }

    @Override
    public Vehicule getVehicule(Long id) {
        Vehicule v = null;
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM vehicules WHERE id_vehicule = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                v = new Vehicule();
                v.setIdVehicule(rs.getLong("id_vehicule"));
                v.setImmatriculation(rs.getString("immatriculation"));
                v.setModele(rs.getString("modele"));
                v.setCouleur(rs.getString("couleur"));
                v.setAnnee(rs.getInt("annee"));
                v.setStatut(rs.getString("statut"));
                v.setDerniereMaintenance(rs.getDate("derniere_maintenance"));
                v.setCapacite(rs.getInt("capacite"));
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    @Override
    public Vehicule update(Vehicule v) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE vehicules SET immatriculation=?, modele=?, couleur=?, annee=?, statut=?, derniere_maintenance=?, capacite=? WHERE id_vehicule=?");
            ps.setString(1, v.getImmatriculation());
            ps.setString(2, v.getModele());
            ps.setString(3, v.getCouleur());
            ps.setInt(4, v.getAnnee());
            ps.setString(5, v.getStatut());
            ps.setDate(6, new java.sql.Date(v.getDerniereMaintenance().getTime()));
            ps.setInt(7, v.getCapacite());
            ps.setLong(8, v.getIdVehicule());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;
    }

    @Override
    public void deleteVehicule(Long id) {
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM vehicules WHERE id_vehicule=?");
            ps.setLong(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
