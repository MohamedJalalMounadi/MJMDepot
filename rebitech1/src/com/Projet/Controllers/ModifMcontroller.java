package com.Projet.Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Projet.DAO.MarcheDao;
import com.Projet.model.Marche;


/**
 * Servlet implementation class ModifMcontroller
 */
@WebServlet("/ModifMcontroller")
public class ModifMcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifMcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =  request.getSession();
		
		 Marche Mar = (Marche)  session.getAttribute("marche");
		 String idm=request.getParameter("IdM");
		 System.out.println(idm);
			String intitule=request.getParameter("IntituleM");
			System.out.println(intitule+"okokokoko");
			Double montant=Double.parseDouble((request.getParameter("Montant")));
		Mar.setIdentifiantM(idm);
		Mar.setIntituleM(intitule);
		Mar.setMontantM(montant);
		MarcheDao Md= new MarcheDao();
		try {
			Md.updateM(Mar);
		} catch (IllegalStateException e) {
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
