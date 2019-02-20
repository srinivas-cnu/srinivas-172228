package com.cg.Assignment7;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class IterationTest {


	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("venky","nellore");
		map.put("chintu","guntur");
		map.put("manu","karnataka");
		map.put("surya","austrailia");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
	}
}
		

