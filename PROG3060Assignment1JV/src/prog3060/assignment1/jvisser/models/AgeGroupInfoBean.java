/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		AgeGroupInfoBean.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.models;

public class AgeGroupInfoBean {

	private String description;
	private int malePopulation2011;
	private int femalePopulation2011;
	private int malePopulation2016;
	private int femalePopulation2016;
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setMalePopulation2011(int value) {
		this.malePopulation2011 = value;
	}
	
	public int getMalePopulation2011() {
		return this.malePopulation2011;
	}
	
	public void setFemalePopulation2011(int value) {
		this.femalePopulation2011 = value;
	}
	
	public int getFemalePopulation2011() {
		return this.femalePopulation2011;
	}
	
	public void setMalePopulation2016(int value) {
		this.malePopulation2016 = value;
	}
	
	public int getMalePopulation2016() {
		return this.malePopulation2016;
	}
	
	public void setFemalePopulation2016(int value) {
		this.femalePopulation2016 = value;
	}
	
	public int getFemalePopulation2016() {
		return this.femalePopulation2016;
	}
	
	public AgeGroupInfoBean() {}
}
