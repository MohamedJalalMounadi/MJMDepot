package com.Projet.Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.SystemException;

import com.Projet.DAO.ProjetDao;
import com.Projet.model.Projet;

/**
 * Servlet implementation class Projetcontroller
 */
@WebServlet("/Projetcontroller")
public class Projetcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Projetcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("7");
		String id=request.getParameter("IdP");
		String intitule=request.getParameter("Intitule");
		Projet P = new Projet(id,intitule);
		System.out.println( P.getIntitule());
		System.out.println("4");


		ProjetDao PD = new ProjetDao();
		try {
			PD.AddProjet(P);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("5");
		HttpSession ses =  request.getSession();
		ses.setAttribute("projet",P);
		
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ajouter-marche.jsp") ;
		    requestDispatcher.forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
