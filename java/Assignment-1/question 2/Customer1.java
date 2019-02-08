package com.cg.gopi;

public class Customer1 {
	private static String name; 
	private static String memberType;
	private boolean member = false;
	
	public Customer1(String name) 
	{
		super();
		this.name = name;
	}

	
	public static String getName() {
		return name;
	}
	
	
	public static String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public boolean isMember(boolean member)
	{
		
		if (member == false)
		{
			System.out.println("Please take a membership.");
			System.out.println("Sorry..No discount");
		}
	
		
		
		
		return member;
	}
}
