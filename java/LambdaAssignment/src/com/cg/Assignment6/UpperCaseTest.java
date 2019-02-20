package com.cg.Assignment6;
import java.util.ArrayList;

public class UpperCaseTest {


	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("chintu");
		list.add("srinivas");
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
		

	}
}
