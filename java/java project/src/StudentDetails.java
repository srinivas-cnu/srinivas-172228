import java.util.Scanner;

public class StudentDetails {

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("names");
    int n = scan.nextInt();
    System.out.println("Enter the " + n + " names: ");

    String [] names = new String[n];
    
    for (int i = 0; i < names.length; i++){
        names[i] = scan.nextLine();
        }
    
    for (String i : names){
        System.out.println(i.toUpperCase());
        }

    scan.close();

}

}