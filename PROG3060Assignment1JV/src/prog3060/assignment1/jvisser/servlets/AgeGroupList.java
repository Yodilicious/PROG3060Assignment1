/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		AgeGroupList.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prog3060.assignment1.jvisser.dao.ApplicationDao;
import prog3060.assignment1.jvisser.models.AgeGroupInfoBean;
import prog3060.assignment1.jvisser.models.IndividualGeoAreaDetailsBean;

@WebServlet("/ageGroup")
public class AgeGroupList extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ApplicationDao appDao = new ApplicationDao();
		
		int[] ageGroups = {3, 9, 15, 22, 28, 34, 40, 46, 52, 58, 64, 70, 76, 83, 89, 95, 101, 108, 114, 120, 126};
		
		List<AgeGroupInfoBean> ageGroupInfo = new ArrayList<AgeGroupInfoBean>();
		
		for(int i = 0; i < ageGroups.length; i++) {
			AgeGroupInfoBean temp = appDao.GetAgeGroupInfo(ageGroups[i]);
			ageGroupInfo.add(temp);
		}
				
		req.setAttribute("ageGroupList", ageGroupInfo);
		req.getRequestDispatcher("/html/AgeGroupList.jsp").forward(req, resp);
	}
}
