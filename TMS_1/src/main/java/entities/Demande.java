package entities;
import java.io.Serializable;
import java.util.Date;

public class Demande {

    private Long idDemande;
    private String numeroDemande;
    private Date dateDemande;
    private String adresseLivraison;
    private String ville;
    private String codePostal;
    private String pays;
    private Date dateLivraison;
    private String statut;
    private String commentaire;
    // Constructor
    public Demande(String numeroDemande, Date dateDemande, String adresseLivraison, String ville, 
                   String codePostal, String pays, Date dateLivraison, String statut, String commentaire) {
        
        this.numeroDemande = numeroDemande;
        this.dateDemande =  dateDemande;
        this.adresseLivraison = adresseLivraison;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
        this.dateLivraison =  dateLivraison;
        this.statut = statut;
        this.commentaire = commentaire;
       
    }



	public Demande() {
        super();
    }



	// Getters and Setters
    public Long getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Long idDemande) {
        this.idDemande = idDemande;
    }

    public String getNumeroDemande() {
        return numeroDemande;
    }

    public void setNumeroDemande(String numeroDemande) {
        this.numeroDemande = numeroDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    // toString method
    @Override
    public String toString() {
        return "Demande{" +
                "idDemande=" + idDemande +
                ", numeroDemande='" + numeroDemande + '\'' +
                ", dateDemande=" + dateDemande +
                ", adresseLivraison='" + adresseLivraison + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", pays='" + pays + '\'' +
                ", dateLivraison=" + dateLivraison +
                ", statut='" + statut + '\'' +
                ", commentaire='" + commentaire + '\''  +
                '}';
    }
}
