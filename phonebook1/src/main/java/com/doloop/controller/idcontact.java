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
import com.dollop.entity.user;
import com.dollop.services.contactDAOImpl;

/**
 * Servlet implementation class idcontact
 */
public class idcontact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public idcontact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contact Contact = new contact(Integer.parseInt(request.getParameter("uid")),request.getParameter("name"));
		contactDAO ph = new contactDAOImpl();
		RequestDispatcher dispatcher=null;
		 try {
			List<contact> view = ph.viewContactById(Contact);
			request.setAttribute("list", view);
			dispatcher=request.getRequestDispatcher("./idcontact.jsp");
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
