package com.cg.Assignment4;
import java.util.ArrayList;
import java.util.List;
public class RemoveOdd {



	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("chintu");
		l.add("Elephant");
		l.add("tiger");
		l.add("Srinivas");

		l.removeIf(oddwords ->(oddwords.length()%4!=0));
		l.forEach(words -> System.out.println(words));
			}
	}



