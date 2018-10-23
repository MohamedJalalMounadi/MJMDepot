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

import com.Projet.model.Devis;


/**
 * Servlet implementation class ModifDcontroller
 */
@WebServlet("/ModifDcontroller")
public class ModifDcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifDcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =  request.getSession();
		
		 Devis Mar = (Devis)  session.getAttribute("devis");
		 String idD=request.getParameter("identifiantD");
		 String etd = request.getParameter("etatD");
		 Double mtd = Double.parseDouble(request.getParameter("montantD"));
		 String Ddev = request.getParameter("designationD"); 
		 System.out.println(idD);
			String intitule=request.getParameter("IntituleM");
			System.out.println(intitule+"okokokoko");
			
		Mar.setIdentifiantD(idD);
		Mar.setEtatD(etd);
		Mar.setMontantD(mtd);
		Mar.setDesignationD(Ddev);
		DevisDao Md= new DevisDao();
		try {
			Md.updateD(Mar);
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
