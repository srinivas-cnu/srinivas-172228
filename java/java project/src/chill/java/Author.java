package chill.java;

public class Author {
	static String name;
	static String email;
	static char gender;
	public Author(String name, String email, char gender) 
	{
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
         public String toString()
         {
        	 return "Authorname :" + name + "Authoremail :"+email+ "Authorgender:"+gender;
         }
}
