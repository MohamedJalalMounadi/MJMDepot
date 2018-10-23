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

import com.Projet.DAO.MarcheDao;
import com.Projet.model.Marche;
import com.Projet.model.Projet;

/**
 * Servlet implementation class Marchecontroller
 */
@WebServlet("/Marchecontroller")
public class Marchecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Marchecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =  request.getSession();
		 Projet Pro = (Projet)  session.getAttribute("projet");
		 String idm=request.getParameter("IdM");
			String intitule=request.getParameter("IntituleM");
			System.out.println(intitule+"okokokoko");
			Double montant=Double.parseDouble((request.getParameter("Montant")));
		Marche M = new	Marche(idm,intitule,montant,Pro);
		MarcheDao Md= new MarcheDao();
		try {
			Md.AddMarche(M);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListeProjets.jsp") ;
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
