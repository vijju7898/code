package com.doloop.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dollop.DAO.contactDAO;
import com.dollop.entity.contact;
import com.dollop.services.contactDAOImpl;


/**
 * Servlet implementation class viewcontactservlet
 */
public class viewcontactservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public viewcontactservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contactDAO ph = new contactDAOImpl();
		RequestDispatcher dispatcher=null;
		 try {
			 Integer id = Integer.parseInt(request.getParameter("uid"));
			List<contact> view = ph.viewAllContact(id);
			request.setAttribute("list", view);
			dispatcher=request.getRequestDispatcher("./dashboard.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
