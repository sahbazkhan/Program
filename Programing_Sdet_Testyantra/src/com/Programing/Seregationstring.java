package com.Programing;

public class Seregationstring {

	public static void main(String[] args) {
		String s="abc123@%$";
		String alph="";
		String numeric="";
		String special="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				alph=alph+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				numeric=numeric+s.charAt(i);
			}
			else {
				special=special+s.charAt(i);
			}
		}
		  System.out.println(alph);
		  System.out.println(numeric);
		  System.out.println(special);

	}

}
