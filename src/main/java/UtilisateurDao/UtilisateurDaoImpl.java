package UtilisateurDao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entities.Utilisateur;

public class UtilisateurDaoImpl implements IUtilisateurDao{

	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO utilisateurs (nom_utilisateur,mot_de_passe,id_role,nom_complet,telephone,email,statut_disponibilite) VALUES (?,?,?,?,?,?,?)");
			ps.executeUpdate();
			ps.setString(1, u.getNom_utilisateur());
			ps.setString(2, u.getMot_de_passe());
			ps.setInt(3, u.getId_role());
			ps.setString(4, u.getNom_complet());
			ps.setString(5, u.getTelephone());
			ps.setString(6, u.getEmail());
			ps.setString(7, u.getStatut_disponibilite());
			ps.close();
			return u;
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<Utilisateur> afficherUtilisateurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur findByIdUtilisateur(int id_utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur updateUtilisateur(int id_utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUtilisateur(int id_utilisateur) {
		// TODO Auto-generated method stub
		
	}

}
