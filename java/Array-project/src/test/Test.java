
package test;

import pojo_classes.Employee;
import service.MyArrayList;

public class Test {

	public static void main(String[] args) {
		MyArrayList l=new MyArrayList(2);
		Employee e1=new Employee(1,"sri",200000);
		Employee e2=new Employee(2,"nivas",10000);
		Employee e3=new Employee(3,"cnu",20000);
		l.addEmployee(e2);
		l.addEmployee(e3);
		boolean conf=l.addEmployee(e3);
		if(conf)
			System.out.println("employee addedd successfully");
		else
			System.out.println("failed to add employess");
		
		l.showAllEmployee();
		l.getEmployee(222);
		
		
		l.deleteEmployee(111);
		l.deleteEmployee(222);
		l.deleteEmployee(333);

		
		int x=l.deleteEmployee(1111);
		if(x==-1)
			System.out.println("there are no employees to delete");
		else if(x==0)
			System.out.println("employee not found with given id");
		else
			System.out.println("employee deleted successfully");
		
		l.showAllEmployee();
		

	}

}
