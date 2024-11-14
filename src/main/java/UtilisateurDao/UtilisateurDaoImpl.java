package UtilisateurDao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Utilisateur;

public class UtilisateurDaoImpl implements IUtilisateurDao{

	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO utilisateurs (nom_utilisateur,mot_de_passe,id_role,nom_complet,telephone,email,statut_disponibilite) VALUES (?,?,?,?,?,?,?)");
			ps.setString(1, u.getNom_utilisateur());
			ps.setString(2, u.getMot_de_passe());
			ps.setInt(3, u.getId_role());
			ps.setString(4, u.getNom_complet());
			ps.setString(5, u.getTelephone());
			ps.setString(6, u.getEmail());
			ps.setString(7, u.getStatut_disponibilite());
			ps.executeUpdate();
			ps.close();
			return u;
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<Utilisateur> afficherUtilisateurs() {
		
		Connection connection = SingletonConnection.getConnection();
	    List<Utilisateur> utilisateurs = new ArrayList<>();

	    try {
	        PreparedStatement ps = connection.prepareStatement("SELECT * FROM utilisateurs");
	        ResultSet rs = ps.executeQuery(); // Correct method for SELECT queries

	        while (rs.next()) {
	            Utilisateur u = new Utilisateur();
	            // Assuming you have getters and setters for the Article class fields
	            u.setId_utilisateur(rs.getInt("id_utilisateur"));
	            u.setNom_utilisateur(rs.getString("nom_utilisateur"));
	            u.setMot_de_passe(rs.getString("mot_de_passe"));
	            u.setId_role(rs.getInt("id_role"));
	            u.setNom_complet(rs.getString("nom_complet"));
	            u.setTelephone(rs.getString("telephone"));
	            u.setEmail(rs.getString("email"));
	            u.setStatut_disponibilite(rs.getString("statut_disponibilite"));
	            utilisateurs.add(u);
	        }

	        rs.close();
	        ps.close();

	    } catch (SQLException e) {
	        e.printStackTrace(); // Better to log the exception
	    }

	    return utilisateurs; 
	}

	@Override
	public Utilisateur findByIdUtilisateur(int id_utilisateur) {
		Connection connection =  SingletonConnection.getConnection();
		Utilisateur utilisateur = null;
		
		try{
			PreparedStatement ps =  connection.prepareStatement("SELECT * FROM utilisateurs WHERE id_utilisateur=?");
			 ps.setInt(1, id_utilisateur);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				utilisateur = new 	Utilisateur();
				 utilisateur.setId_utilisateur(rs.getInt("id_utilisateur"));
				 utilisateur.setNom_utilisateur(rs.getString("nom_utilisateur"));
				 utilisateur.setMot_de_passe(rs.getString("mot_de_passe"));
				 utilisateur.setId_role(rs.getInt("id_role"));
				 utilisateur.setNom_complet(rs.getString("nom_complet"));
				 utilisateur.setTelephone(rs.getString("telephone"));
				 utilisateur.setEmail(rs.getString("email"));
				 utilisateur.setStatut_disponibilite(rs.getString("statut_disponibilite"));
			}
			
			rs.close();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return utilisateur;
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE utilisateurs SET nom_utilisateur=?,mot_de_passe=?,nom_complet=?,telephone=?,email=?,statut_disponibilite=? WHERE id_utilisateur= ? ");
			ps.setString(1, utilisateur.getNom_utilisateur());
			ps.setString(2, utilisateur.getMot_de_passe());
			ps.setString(3, utilisateur.getNom_complet());
			ps.setString(4, utilisateur.getTelephone());
			ps.setString(5, utilisateur.getEmail());
			ps.setString(6, utilisateur.getStatut_disponibilite());
			ps.setInt(7, utilisateur.getId_utilisateur());
			ps.executeUpdate();
			ps.close();
			return utilisateur;
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {
		
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM utilisateurs WHERE id_utilisateur = ?");
			ps.setInt(1, utilisateur.getId_utilisateur());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
