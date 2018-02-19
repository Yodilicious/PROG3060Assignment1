/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		IndividualGeographicAreaDetails.java
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
import prog3060.assignment1.jvisser.models.IndividualGeoAreaDetailsBean;

@WebServlet("/igad")
public class IndividualGeographicAreaDetails extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("gaid");
		
		ApplicationDao appDao = new ApplicationDao();
		
		IndividualGeoAreaDetailsBean areaDetail = appDao.IndividualGeographicAreaDetails(id);
		
		int level = Integer.parseInt(areaDetail.getLevel());
		
		List<String> names;
		if(level == 0) {
			names = appDao.GetAllProvinceNames();
		} else {
		
			names = appDao.IndividualGeographicAreaDetailNames(Integer.toString(++level), areaDetail.getCode());
		}
				
		req.setAttribute("areaDetail", areaDetail);
		req.setAttribute("names", names);
		req.getRequestDispatcher("/html/IndividualGeographicAreaDetails.jsp").forward(req, resp);
	}
}
