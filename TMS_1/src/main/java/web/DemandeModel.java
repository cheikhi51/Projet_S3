package web;
import entities.Demande;

import java.util.ArrayList;
import java.util.List;

public class DemandeModel {
	private String motCle;
	private List<Demande> demandes =new ArrayList<Demande>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
}
