
package pojo_classes;

public class Employee {
	private int empId;
	private String name;
	private double empSal;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String name, double empSal) {
		super();
		this.empId = empId;
		this.name = name;
		this.empSal = empSal;
	}
	

}

