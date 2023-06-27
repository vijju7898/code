package com.doloop.controller;

import java.io.IOException;
import java.sql.SQLException;

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
 * Servlet implementation class deleteservlet
 */
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public deleteservlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		user User = new user(Integer.parseInt(request.getParameter("uid")));
		userDAO ph = new userDAOImpl();
		HttpSession session = request.getSession();
		Integer con = (Integer) session.getAttribute("login");
		if (con != null) {

			try {
				if (ph.delete(User)) {
					request.setAttribute("msg", " delete Successful!!");
					RequestDispatcher rd = request.getRequestDispatcher("./delete.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("msg", " delete FAILED!");
					RequestDispatcher rd = request.getRequestDispatcher("./delete.jsp");
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
			request.setAttribute("msg", " login first!");
			RequestDispatcher rd = request.getRequestDispatcher("./delete.jsp");
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
