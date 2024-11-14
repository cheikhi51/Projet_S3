package UtilisateurDao;

import java.util.List;

import entities.Utilisateur;

public interface IUtilisateurDao {
	
	public Utilisateur saveUtilisateur(Utilisateur u);
	public List<Utilisateur> afficherUtilisateurs();
	public Utilisateur findByIdUtilisateur(int id_utilisateur);
	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	public void deleteUtilisateur(Utilisateur utilisateur);
}
