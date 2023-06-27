package com.doloop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dollop.DAO.userDAO;
import com.dollop.entity.user;
import com.dollop.services.userDAOImpl;

/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public update() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user con = new user(request.getParameter("name"),request.getParameter("email"),request.getParameter("password"),request.getParameter("contact"));
		userDAO ph = new userDAOImpl();
		HttpSession session = request.getSession();
		con.setuId((Integer)session.getAttribute("login"));
		try {
			if(ph.update(con))
			{
				request.setAttribute("msg", " update Successful!!");
				RequestDispatcher rd=request.getRequestDispatcher("./update.jsp");
				rd.forward(request, response);
			}
			else{
				request.setAttribute("msg", " update FAILED!");
				RequestDispatcher rd=request.getRequestDispatcher("./update.jsp");
				rd.forward(request, response);
			}
			
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
