/*
 *  PROG3060
 *   @author Jodi Visser
 *   Assignment 1: JDBC Web Application using CanadaCensusDB
 *		GeoAreaClassBean.java
 *   	Date Created: February 16, 2018
 */

package prog3060.assignment1.jvisser.models;

public class GeoAreaClassBean {

	private int geographicAreaId;
	private int level;
	private String name;
	
	public void setGeographicAreaId(int value) {
		this.geographicAreaId = value;
	}
	
	public int getGeographicAreaId() {
		return this.geographicAreaId;
	}
	
	public void setLevel(int value) {
		this.level = value;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public GeoAreaClassBean() {}
}
