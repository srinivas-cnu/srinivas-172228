package com.cg.gopi;

public class studentmainclass {

	public static void main(String[] args) {
		 Student1 ak = new Student1("bob", "china");
		    System.out.println(ak);  // toString()

		  
		    ak.setAddress("pakistan");
		    System.out.println(ak);  
		    System.out.println(ak.getName());
		    System.out.println(ak.getAddress());

		 
		    ak.addCourseGrade("Maths", 99);
		    ak.addCourseGrade("Science", 77);
		    ak.addCourseGrade("Social", 56);
		    ak.printGrades();
		    System.out.printf("The average grade is %.2f%n", ak.getAverageGrade());

	}

}
