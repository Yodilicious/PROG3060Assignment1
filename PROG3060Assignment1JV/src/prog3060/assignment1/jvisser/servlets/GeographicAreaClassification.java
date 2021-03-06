/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		GeographicAreaClassification.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prog3060.assignment1.jvisser.dao.ApplicationDao;
import prog3060.assignment1.jvisser.models.GeoAreaClassBean;

@WebServlet("/gac")
public class GeographicAreaClassification extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ApplicationDao appDao = new ApplicationDao();
		
		List<GeoAreaClassBean> geoAreaClasses = appDao.GeographicAreaClassifications();
		
		req.setAttribute("geoArea", geoAreaClasses);
		req.getRequestDispatcher("/html/GeographicAreaClassification.jsp").forward(req, resp);
	}
}
