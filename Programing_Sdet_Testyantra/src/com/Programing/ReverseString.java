package com.Programing;

public class ReverseString {

	public static void main(String[] args) {
		String s="India";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		  if(s.equals(rev)) {
			  System.out.println("palindrone");
		  }
		  else {
			  System.out.println("not palindrone");
		  }

	}

}
