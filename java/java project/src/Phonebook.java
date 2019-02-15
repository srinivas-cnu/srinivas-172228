import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Phonebook {

	public static void main(String[] args) {
		contactlist x=new contactlist("cnu","123");
		x.addcontactlist("sai","1234");
		x.addcontactlist("raja","5678");
		x.addcontactlist("rishi","9123");
		x.addcontactlist("pooja","8765");
		x.addcontactlist("ram","8734");
		x.addcontactlist("revanth","7348");
		
		
		String find=x.fndSearch("pooja");
		if(find!=null) {
			System.out.println("phone number is:  "+find);
		}
		
		else {
			
			System.out.println("friend not found");
		}
     }
}
			
	
			
			
			
			

		
