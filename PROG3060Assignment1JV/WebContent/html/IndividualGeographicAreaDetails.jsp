<!--
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		IndividualGeographicAreaDetails.jsp
 *   	Date Created: February 16, 2018
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,prog3060.assignment1.jvisser.models.IndividualGeoAreaDetailsBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="PROG3060Assignment1JV/css/main.css" rel="stylesheet">
<title>Assignment 1 - Canada Census</title>
</head>
<body>
    
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Assignment 1 - Canada Census</a>
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="#">Sign out</a>
        </li>
      </ul>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column">
              <li class="nav-item">
                <a class="nav-link active" href="gac">
                  <span data-feather="layers"></span>
                  Geographic Area Classification<span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/PROG3060Assignment1JV/ageGroup">
                  <span data-feather="bar-chart-2"></span>
                  Age Group 
                </a>
              </li>
            </ul>
          </div>
        </nav>
                
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
          <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Individual Geographic Area Details</h1>                       
          </div>
          <div class="row">
          	<div class="col-md-12">
          		<table class="table">
				  <thead class="thead-dark">
				    <tr>
				      <th scope="col">Name</th>
				      <th scope="col">Code</th>
				      <th scope="col">Level</th>
				      <th scope="col">Total Population</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<%
			       		IndividualGeoAreaDetailsBean areaDetail = (IndividualGeoAreaDetailsBean)request.getAttribute("areaDetail");
			       	%>
				    	<tr>
					      <td><%=areaDetail.getName()%></td>
					      <td><%=areaDetail.getCode()%></td>
					      <td><%=areaDetail.getLevel()%></td>
					      <td><%=areaDetail.getTotalPopulation()%></td>
					    </tr>
				  </tbody>
				</table>
				
				<table class="table">
				  <thead class="thead-dark">
				    <tr>
				      <th scope="col">Name</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<%
			       		List<String> names = (ArrayList)request.getAttribute("names");
				  	
					  	Iterator<String> iterator = names.iterator();
			      		
			      		while(iterator.hasNext()) {
			      			String name = iterator.next();	
			       	%>
				    	<tr>
					      <td><%=name%></td>
					    </tr>
					<%
			      		}
					%>
				  </tbody>
				</table>
				
          	</div>
          </div>
        </main>
      </div>
    </div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
			
	<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>
      feather.replace()
    </script>
	
</body>
</html>