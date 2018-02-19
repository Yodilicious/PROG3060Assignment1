/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		IndividualGeoAreaDetailsBean.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.models;

public class IndividualGeoAreaDetailsBean {

	private String name;
	private String code;
	private String level;
	private int totalPopulation;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setLevel(String value) {
		this.level = value;
	}
	
	public String getLevel() {
		return this.level;
	}
	
	public void setTotalPopulation(int value) {
		this.totalPopulation = value;
	}
	
	public int getTotalPopulation() {
		return this.totalPopulation;
	}
	
	public IndividualGeoAreaDetailsBean() {}
}
