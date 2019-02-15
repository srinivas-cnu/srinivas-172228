package com.example.domain;

public class Employee {
public int EmployeeId;
public String EmployeeName;
public String EmployeeSSN;
public Double EmployeeSalary;
public Employee(int employeeId, String employeeName, String employeeSSN, Double employeeSalary) {
	super();
	EmployeeId = employeeId;
	EmployeeName = employeeName;
	EmployeeSSN = employeeSSN;
	EmployeeSalary = employeeSalary;
	
}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public String getEmployeeSSN() {
	return EmployeeSSN;
}
public void setEmployeeSSN(String employeeSSN) {
	EmployeeSSN = employeeSSN;
}
public Double getEmployeeSalary() {
	return EmployeeSalary;
}
public void setEmployeeSalary(Double employeeSalary) {
	EmployeeSalary = employeeSalary;
}
}



