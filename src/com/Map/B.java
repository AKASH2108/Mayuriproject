package com.Map;
import java.util.*;
import java.io.*;
public class B  {
public static void main(String[] args)throws Exception {
	Properties p =new Properties();
	FileInputStream fis =new FileInputStream("aaa.properties");
	p.load(fis);
	System.out.println(p);
	System.out.println(p.getProperty("user"));
	
	
   p.setProperty("sky","5555");
   System.out.println(p);
    FileOutputStream ois=new FileOutputStream("abc.properties");
   p.store(ois,"updated by akash");
   System.out.println(p);
	
	
}


}
