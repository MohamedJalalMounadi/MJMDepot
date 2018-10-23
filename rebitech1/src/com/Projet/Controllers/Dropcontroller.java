package com.Projet.Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Projet.DAO.DevisDao;
import com.Projet.DAO.MarcheDao;
import com.Projet.DAO.ProjetDao;
import com.Projet.model.Devis;
import com.Projet.model.Marche;
import com.Projet.model.Projet;

/**
 * Servlet implementation class Dropcontroller
 */
@WebServlet("/Dropcontroller")
public class Dropcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dropcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		int S = Integer.parseInt(request.getParameter("identif"));
		
		if(page.equalsIgnoreCase("projet")) {
	ProjetDao PD = new ProjetDao();
	Projet P = PD.getProjetById(S);
	PD.dropProjet(P);
	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListeProjets.jsp") ;
	    requestDispatcher.forward(request, response) ;}
		else if(page.equalsIgnoreCase("marche")) {
			MarcheDao Md = new MarcheDao();
			Marche M = Md.getMarcheById(S);
			Md.dropMarche(M);
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListeProjets.jsp") ;
			    requestDispatcher.forward(request, response) ;
		} else if(page.equalsIgnoreCase("devi")) {
			DevisDao Md = new DevisDao();
			Devis M = Md.getDevisById(S);
			Md.dropDevis(M);
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListeProjets.jsp") ;
			    requestDispatcher.forward(request, response) ;
			
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
