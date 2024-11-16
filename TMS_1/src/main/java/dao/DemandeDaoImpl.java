package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import entities.Demande;

public class DemandeDaoImpl implements IDemandeDao {
	
	public Demande save(Demande d) {
	    Connection connection = SingletonConnection.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement(
	            "INSERT INTO demandes (numero_demande, date_demande, adresse_livraison, ville, code_postal, pays, date_livraison, statut, commentaire) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
	            Statement.RETURN_GENERATED_KEYS
	        );
	        
	        ps.setString(1, d.getNumeroDemande());
	        ps.setDate(2, new java.sql.Date(d.getDateDemande().getTime()));
	        ps.setString(3, d.getAdresseLivraison());
	        ps.setString(4, d.getVille());
	        ps.setString(5, d.getCodePostal());
	        ps.setString(6, d.getPays());
            ps.setDate(7, new java.sql.Date(d.getDateLivraison().getTime()));
	        ps.setString(8, d.getStatut());
	        ps.setString(9, d.getCommentaire());
	        
	        ps.executeUpdate();
	        PreparedStatement ps2=connection.prepareStatement
    				("SELECT MAX(ID) AS MAX_ID FROM demandes");
	        ResultSet rs=ps2.executeQuery();
    		if(rs.next()) {
    			d.setIdDemande(rs.getLong("MAX_ID"));
    		}
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	    return d;
	}

	@Override
	public List<Demande> DemandesParMc(String mc) {
		List<Demande> demandes = new ArrayList<>();
	    Connection connection = SingletonConnection.getConnection();
	    try {PreparedStatement ps = connection.prepareStatement("SELECT * FROM demandes WHERE ville LIKE ?");
	    		ps.setString(1, "%" + mc + "%");
	    		ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Demande d = new Demande();
	            d.setIdDemande(rs.getLong("id_demande"));
	            d.setNumeroDemande(rs.getString("numero_demande"));
	            d.setDateDemande(rs.getDate("date_demande"));
	            d.setAdresseLivraison(rs.getString("adresse_livraison"));
	            d.setVille(rs.getString("ville"));
	            d.setCodePostal(rs.getString("code_postal"));
	            d.setPays(rs.getString("pays"));
	            d.setDateLivraison(rs.getDate("date_demande"));
	            d.setStatut(rs.getString("statut"));
	            d.setCommentaire(rs.getString("commentaire"));
	            demandes.add(d);
	        }
	    
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return demandes;
	}

	@Override
	public List<Demande> getAllDemandes() {
		List<Demande> demandes = new ArrayList<>();
	    Connection connection = SingletonConnection.getConnection();
	    try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM demandes");
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	            Demande d = new Demande();
	            d.setIdDemande(rs.getLong("id_demande"));
	            d.setNumeroDemande(rs.getString("numero_demande"));
	            d.setDateDemande(rs.getDate("date_demande"));
	            d.setAdresseLivraison(rs.getString("adresse_livraison"));
	            d.setVille(rs.getString("ville"));
	            d.setCodePostal(rs.getString("code_postal"));
	            d.setPays(rs.getString("pays"));
	            d.setDateLivraison(rs.getDate("date_demande"));
	            d.setStatut(rs.getString("statut"));
	            d.setCommentaire(rs.getString("commentaire"));
	            demandes.add(d);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return demandes;
	}

	@Override
	public Demande getDemande(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Demande update(Demande d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDemande(Long id) {
		// TODO Auto-generated method stub
		Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM demandes WHERE id_demande=?");
            ps.setLong(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
		
	


}
