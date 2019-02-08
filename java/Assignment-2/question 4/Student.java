package com.cg.fifth;

import java.util.Arrays;

public class Student extends Person{
	private int numCourses=0;
	private String[] courses=new String[30];
	private int[] grades=new int[30];

    public Student(String name,String address) {
		super(name,address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "toString()=" + super.toString() + "]";
	}
public void addCourseGrade(String course,int grade) {
	for(int i=0;i<courses.length;i++) {
		if (courses[i]==null){
		    grades[i]=grade;
		    courses[i]=course;
		    break;
		   }
		 else
		{
			i++;
	}
}
}
public void printGrades() {
	for(int i=0;i<courses.length;i++) {
		if(courses[i]!= null) {
			System.out.println("course: "+ courses[i] + " grade: "+ grades[i]);
		}
			
	}
}
public double getAverageGrade() {
	int n=0;
    int sum=0;
    for(int i=0;i< courses.length;i++){
        if (courses[i]!=null){
            sum=sum+grades[i];
            n++;
        }

    }
    return sum/n;

}
}
