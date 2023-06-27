package com.doloop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dollop.DAO.contactDAO;
import com.dollop.entity.contact;
import com.dollop.services.contactDAOImpl;

/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public delete() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		contact con = new contact(Integer.parseInt(request.getParameter("id")));
		contactDAO ph = new contactDAOImpl();
		HttpSession session = request.getSession();
		con.setuId((Integer) session.getAttribute("login"));

		try {
			if (ph.deleteContact(con)) {
				request.setAttribute("msg", " delete Successful!!");
				RequestDispatcher rd = request.getRequestDispatcher("./dashboard.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("msg", " delete FAILED!");
				RequestDispatcher rd = request.getRequestDispatcher("./deletecontact.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
