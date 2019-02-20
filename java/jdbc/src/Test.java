


import com.cg.jdbc.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		try {
			//System.out.println(new EmployeeDAO().insert(new Employee(1005, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			//System.out.println(new EmployeeDAO().read(1000));
			//System.out.println(new EmployeeDAO().delete(1005)+" row deleted successfully");
			System.out.println(new EmployeeDao().update(1004,"revanth")+" row update successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

