package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import dao.IDemandeDao;
import dao.DemandeDaoImpl;
import entities.Demande;

/**
 * Servlet implementation class DemandeServlet
 */
public class DemandeServlet extends HttpServlet {
	private IDemandeDao metier;

    public void init() throws ServletException {
        metier =  new DemandeDaoImpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/demande.demande")) {
		    // Initialize a model to hold the list of demandes
		    DemandeModel model = new DemandeModel();
		    List<Demande> demandes = metier.getAllDemandes();  // Ensure DemandeDao has this method to retrieve all demandes
		    model.setDemandes(demandes);
		    request.setAttribute("model", model);
		    request.setAttribute("demandes", demandes);
		    request.getRequestDispatcher("Demandes.jsp").forward(request, response);

		} else if (path.equals("/chercher.demande")) {
		    // Get the search keyword for filtering demandes
		    String motCle = request.getParameter("motCle");
		    DemandeModel model = new DemandeModel();
		    model.setMotCle(motCle);
		    
		    // Fetch demandes based on the keyword
		    List<Demande> demandes = metier.DemandesParMc("%" + motCle + "%");  // Ensure this method filters demandes by keyword
		    model.setDemandes(demandes);
		    request.setAttribute("model", model);
		    request.getRequestDispatcher("ChercherDemande.jsp").forward(request, response);
		
		} else if (path.equals("/saisie.demande")) {
		    request.getRequestDispatcher("ajouterDemande.jsp").forward(request, response);

		} else if (path.equals("/save.demande") && request.getMethod().equals("POST")) {
		    String numeroDemande = request.getParameter("numero_demande");
		    Date dateDemande = Date.valueOf(request.getParameter("date_demande"));
		    String adresseLivraison = request.getParameter("adresse_livraison");
		    String ville = request.getParameter("ville");
		    String codePostal = request.getParameter("code_postal");
		    String pays = request.getParameter("pays");
		    Date dateLivraison = Date.valueOf(request.getParameter("date_livraison"));		    
		    String statut = request.getParameter("statut");
		    String commentaire = request.getParameter("commentaire");

		    Demande demande = metier.save(new Demande(numeroDemande, dateDemande, adresseLivraison, ville, codePostal, pays, dateLivraison, statut, commentaire));
		    request.setAttribute("demande", demande);
		    request.getRequestDispatcher("ConfirmationDemande.jsp").forward(request, response);
		} else if(path.equals("/supprimer.demande")) {
			Long id=Long.parseLong(request.getParameter("id"));
			metier.deleteDemande(id);
			response.sendRedirect("chercher.demande?motCle=");
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
