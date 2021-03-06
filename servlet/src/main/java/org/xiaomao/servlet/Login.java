package org.xiaomao.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3380707926619686942L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String p = request.getParameter("userPass");
		if (p.equals("servlet")) {
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		} else {
			out.print("Sorry username or password error!");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

	}

}
