package UtilisateurDao;

import java.util.List;

import entities.Utilisateur;

public interface IUtilisateurDao {
	
	public Utilisateur saveUtilisateur(Utilisateur u);
	public List<Utilisateur> afficherUtilisateurs();
	public Utilisateur findByIdUtilisateur(int id_utilisateur);
	public Utilisateur updateUtilisateur(int id_utilisateur);
	public void deleteUtilisateur(int id_utilisateur);
}
