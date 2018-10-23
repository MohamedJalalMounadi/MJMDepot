package com.Projet.Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Projet.DAO.DevisDao;
import com.Projet.DAO.MarcheDao;
import com.Projet.DAO.ProjetDao;
import com.Projet.model.Devis;
import com.Projet.model.Marche;
import com.Projet.model.Projet;

@WebServlet("/Recherchecontroller")
/**
 * Servlet implementation class Recherchecontroller
 */

public class Recherchecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Recherchecontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String Mo = request.getParameter("modif");
		int Id = Integer.parseInt(request.getParameter("identif"));
		ProjetDao Pd = new ProjetDao();
		Projet P = Pd.getProjetById(Id);
		
		if (Mo.equalsIgnoreCase("false")) {
			
			
			System.out.println("recherche ok");
			HttpSession ses = request.getSession();
			System.out.println("recherche ok0");
			ses.setAttribute("projet", P);
			System.out.println("recherche ok1");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ajouter-marche.jsp");
			requestDispatcher.forward(request, response);
		} else if(Mo.equalsIgnoreCase("true")) {
			
		
			System.out.println("recherche ok");
			HttpSession ses = request.getSession();
			ses.setAttribute("projet", P);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Modifier-projet.jsp");
			requestDispatcher.forward(request, response);
		}else if(Mo.equalsIgnoreCase("Devi")) {
	
			System.out.println("recherche ok");
			HttpSession ses = request.getSession();
			ses.setAttribute("projet", P);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ajouter-devis.jsp");
			requestDispatcher.forward(request, response);
		}
		else if (Mo.equalsIgnoreCase("marche")) {
			int idm = Integer.parseInt( request.getParameter("idm"));
			MarcheDao ma = new MarcheDao();
			Marche M = ma.getMarcheById(idm);
			System.out.println("recherche ok");
			HttpSession ses = request.getSession();
			System.out.println("recherche ok0.1");
			ses.setAttribute("marche", M);
			
			ses.setAttribute("projet", P);
			System.out.println("recherche ok1");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Modifier-marches.jsp");
			requestDispatcher.forward(request, response);

		}
		else if(Mo.equalsIgnoreCase("modifdevi")) {
			int idm = Integer.parseInt( request.getParameter("identifD"));
			DevisDao DD = new DevisDao();
			Devis D = DD.getDevisById(idm);
			System.out.println("recherche devis ok");
			HttpSession ses = request.getSession();
			ses.setAttribute("devis", D);
			ses.setAttribute("projet", P);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Modifier-devis.jsp");
			requestDispatcher.forward(request, response);
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
