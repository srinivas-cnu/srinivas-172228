package com.example;

public class EmployeeTest {
	int EmployeeId;
	String EmployeeName;
	String EmployeeSSN;
	Double EmployeeSalary;
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public void setEmployeeSSN(String employeeSSN) {
		EmployeeSSN = employeeSSN;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

//public void main()
{
	System.out.println("EmployeID=" + 101);
	System.out.println("EmployeeName=" + "chintu");
	System.out.println("EmployeeSSN=" + "112-221-242");
	System.out.println("EmployeeSalary" + 50000);
}
	
}