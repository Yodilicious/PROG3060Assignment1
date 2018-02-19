/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		Login.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/html/Login.jsp").forward(req, resp);
	}
}
