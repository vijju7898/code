package com.doloop.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dollop.DAO.userDAO;
import com.dollop.entity.user;
import com.dollop.services.userDAOImpl;

/**
 * Servlet implementation class signupservlet
 */
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public signupservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		user User = new user(request.getParameter("name"), request.getParameter("email"),
				request.getParameter("password"), request.getParameter("contact"));

		userDAO udo = new userDAOImpl();
		if (user.getPassword().equals(request.getParameter("cpassword"))) {
			try {
				if (udo.save(User)) {
					request.setAttribute("msg", " Successful!");
					RequestDispatcher rd = request.getRequestDispatcher("./signup.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("msg", " Registration Failed!");
					RequestDispatcher rd = request.getRequestDispatcher("./signup.jsp");
					rd.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("msg", "Password Conform Password not matched !");
			RequestDispatcher rd = request.getRequestDispatcher("./signup.jsp");
			rd.forward(request, response);
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
