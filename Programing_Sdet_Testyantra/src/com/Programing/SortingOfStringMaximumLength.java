package com.Programing;

public class SortingOfStringMaximumLength {
	public static void main(String[]args) {
		String str[]= {"hp","bye","p","mango","Tyss","happy"};
		String max=str[0];
		for(int i=1;i<str.length;i++) {
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		 for(int i=0; i<str.length;i++) {
			if( max.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		 }
	}

}
