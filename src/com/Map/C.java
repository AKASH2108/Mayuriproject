package com.Map;


import java.util.Arrays;
import java.util.ArrayList;

public class C  {
public static void main(String[] args) {
	String s[]= {"a","h","c","d"};
	System.out.println("before sorting");
	for(String s1:s) {
		System.out.println(s1);
	}
	Arrays.sort(s);
	System.out.println("after sorting");
	for(String s2:s) {
	System.out.println(s2);
}
	Arrays.sort(s,new MyComparator());
	System.out.println("after comparator applied");
	for (String s3:s) {
		System.out.println(s3);
	}System.out.println("searching starts");
	Arrays.sort(s);
	System.out.println(Arrays.binarySearch(s,"c"));
	System.out.println(Arrays.binarySearch(s,"z"));
	collection
}




	}