package com.Programing;

import java.util.LinkedHashSet;

public class Uniquecharacterstringword {

	public static void main(String[] args) {
		String s="welcome to to tyss";
		String str[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		//compare all each character of this set with all the character given in the string
		for(String world:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(world.equals(str[i])) {
					count++;
				}
			}
			//print only duplicate
			 if(count==1) {
				 System.out.print(world+=" ");
		}
		  
		

	}

	}




	}


