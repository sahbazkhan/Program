package com.Programing;

import java.util.HashSet;

public class Occuranceofeachcharacterstringword {

	public static void main(String[] args) {
		String s="today match between csk and delhi";
		//convert of string to string array using split method
		String str[]=s.split(" ");
		//create set collection and all the character word
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		//compare all each character of this set with all the character word given in the string
		for( String world:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(world.equals(str[i])) {
					count++;
				}
			}
			System.out.println(world+" = "+count);
		}
		  
		

	}

}
