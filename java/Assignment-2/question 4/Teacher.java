package com.cg.fifth;

public class Teacher extends Person{
public int numCourses =0;
public String[] courses ;


public Teacher(String name, String address) {
	super(name,address);
}

public boolean addCourse(String course) {
	return false;
}
public boolean removeCourse(String course) {
	return true;
}
@Override
public String toString() {
	return "Teacher [toString()=" + super.toString() + "]";
}
}
