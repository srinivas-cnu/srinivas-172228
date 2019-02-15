import java.util.Scanner;
public class Compare {


public static void main(String[] args)
{
	String temp=new String();
	Scanner sc=new Scanner(System.in);	
	String [] list= {"lion","tiger","cat","dog","cheetah"};
	for(int i=0; i<list.length;i++)
		System.out.println(list[i] + " ");

	
	System.out.println("Search name:");
	String s=sc.nextLine();
	
	
	for (int j=0;j < list.length; j++)
	{ 
		if(list[j].equals(s))
		{
			System.out.println(j);
		}
	}
	
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int k=i+1;k<list.length;k++)
			{
			
	
		if(list[i].compareTo(list[k])<0)
		{
			temp=list[i];
			list[i]=list[k];
			list[k]=temp;
		}
		}
	} 
}
}
	
	
	

