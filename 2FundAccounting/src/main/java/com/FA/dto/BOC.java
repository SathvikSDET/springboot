package com.FA.dto;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
//@JsonPropertyOrder({ "id","Firstname", "Middlenames", "Lastname","Phonenumber ","Email", "typeofaccount"})
public class BOC {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getMiddlenames() {
		return Middlenames;
	}
	public void setMiddlenames(String middlenames) {
		Middlenames = middlenames;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTypeofaccount() {
		return typeofaccount;
	}
	public void setTypeofaccount(String typeofaccount) {
		this.typeofaccount = typeofaccount;
	}
	
	private long id;
	private long Phonenumber;
	private String Firstname;
	private String Middlenames;
	private String Lastname;
	private String Email;
	private String typeofaccount;
	

}
