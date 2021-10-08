package com.Programing;

import java.util.LinkedHashSet;

public class Uniquecharacterstring {

	public static void main(String[] args) {
		String s="mandya";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
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
			//print only duplicate
			 if(count==1) {
				 System.out.print(ch);
		}
		  
		

	}

	}




	}


