package com.java.Student;

public class Student {
   private String name;
   private String address;
   private int numcourses;
   private String[] courses= {"java","c","git"};
   private int[] grades= {9,8,9};
private String getAddress() {
	return address;
}
public void setAddress(String address)
{
	this.address=address;
}
public Student(String name, String address)
{
	this.name=name;
	this.address=address;
}
public String getname()
{
	return name;
}
public void setName(String name) {
	this.name=name;
	}
public void printgrades()
{
	for(int i=0;i<grades.length;i++)
	{
		System.out.println("course:"+courses[i]);
	}
}
public void addcourseGrades()
{
for (int i=0; i< courses.length;i++)
{
	System.out.println("Course:"+courses[i]+" "+"Grade:"+grades[i]);
}
}
public void averageGrade()
{
	int sum=0,count=0;
	for(int i=0;i<grades.length;i++) {
		sum=sum+grades[i];
		count++;
	}
	System.out.println("Average of all grades:"+sum/3);
}
public String tostring()
{
	return name+ " " +address;
	}
}

