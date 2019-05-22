package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.*;

public class A {

	public static void main(String[] args) {
		
		Map m=new Map();
			m.put(101, "akash");
			m.put(102, "kash");
			m.put(103, "ash");
			m.put(107, "sh");
			m.put(105, "h");
			m.put(101, "sky");
			//System.out.println(m);
			Set s=m.keySet();
			//System.out.println(s);
			Set s1=m.entrySet();
			//System.out.println(s1);
			 Iterator itr=s1.iterator();
			 while(itr.hasNext()) {
				 Map.Entry m1=(Map.Entry)itr.next();
				 System.out.println(m1.getKey()+"---"+ m1.getValue());
				 if(m1.getKey().equals(101)) {
					m1.setValue("good");}}
					System.out.println(m);
				 }
			 
			
		}
	


