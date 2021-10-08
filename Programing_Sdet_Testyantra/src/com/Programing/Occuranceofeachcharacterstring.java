package com.Programing;

import java.util.HashSet;

public class Occuranceofeachcharacterstring {

	public static void main(String[] args) {
		String s="mandya";
		//create set collection and all the character
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//compare all each character of this set with all the character given in the string
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+" = "+count);
		}
		  
		

	}

}
