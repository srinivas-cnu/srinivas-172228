package com.cg.Assignment5;
import java.util.ArrayList;
import java.util.List;

public class ListString {

public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		array.add("apple");
		array.add("mango");
		array.add("pineapple");
		array.add("grapes");
		System.out.println("String is :\n"+array);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = array.stream().map(apple -> Character.toString(apple.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(stringresult);
	
	}
	}



