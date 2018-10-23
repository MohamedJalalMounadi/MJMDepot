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

import com.Projet.DAO.DevisDao;
import com.Projet.model.Devis;
import com.Projet.model.Projet;

/**
 * Servlet implementation class Deviscontroller
 */
@WebServlet("/Deviscontroller")
public class Deviscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Deviscontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("123");
		Projet Pro = (Projet) session.getAttribute("projet");
		System.out.println(Pro.getIdentifiant());
		String identifiantD = request.getParameter("identifiantD");
		String etatD = request.getParameter("etatD");
		Double montantD = Double.parseDouble((request.getParameter("montantD")));
		String designationD = request.getParameter("designationD");
		Devis D = new Devis(identifiantD, etatD, montantD, designationD, Pro);
		DevisDao Md = new DevisDao();
		try {
			Md.AddDevis(D);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ListeProjets.jsp");
		requestDispatcher.forward(request, response);
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
