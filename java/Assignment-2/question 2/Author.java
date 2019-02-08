package com.assign3;

public class Author 
{
	static String name;
	static String email;
	static char gender;
	public Author(String name,String email,char gender)
	{
	this.name = name;
	this.email =email;
	this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String toString()
	{
		return "Author[ Name = "+name+", email = "+email+", gender = "+gender+"]";
	}

}
