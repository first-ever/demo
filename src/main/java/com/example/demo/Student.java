package com.example.demo;

public class Student {
	 private Integer ID;
	 String FIRSTNAME;
	 String LASTNAME;
	 String STREET;

	public Student(Integer ID, String FIRSTNAME, String LASTNAME, String STREET, String CITY) {
		this.ID = ID;
		this.FIRSTNAME = FIRSTNAME;
		this.LASTNAME = LASTNAME;
		this.STREET = STREET;
		this.CITY = CITY;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String FIRSTNAME) {
		this.FIRSTNAME = FIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String LASTNAME) {
		this.LASTNAME = LASTNAME;
	}

	public String getSTREET() {
		return STREET;
	}

	public void setSTREET(String STREET) {
		this.STREET = STREET;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String CITY) {
		this.CITY = CITY;
	}

	String CITY;

}
