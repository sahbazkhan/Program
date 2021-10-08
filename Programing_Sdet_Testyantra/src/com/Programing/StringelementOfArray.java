package com.Programing;

import java.util.Arrays;
import java.util.Collections;

public class StringelementOfArray {

	public static void main(String[] args) {
		String str[]= {"a","z","p","b","q"};
	     System.out.println("before sorting");
	     for(String string:str) {
	    	 System.out.println(string);
	     }
	        Arrays.sort(str);
	        System.out.println("after sorting in ascending");
	        for(String string:str) {
	        	System.out.println(string);
	        }
	        Arrays.sort(str,Collections.reverseOrder());
	        System.out.println("descending order");
	        for(String string:str) {
	        	System.out.println(string);
	        }
	        
	     
	     

	}

}
