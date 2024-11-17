package web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import UtilisateurDao.UtilisateurDaoImpl;
import entities.Utilisateur;

/**
 * Servlet implementation class utilisateurServlet
 */
@WebServlet("/utilisateurServlet")
public class utilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UtilisateurDaoImpl utilisateurdao = new UtilisateurDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Utilisateur> utilisateurs = utilisateurdao.afficherUtilisateurs();
		request.setAttribute("utilisateurs", utilisateurs);
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/utilisateurs.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
