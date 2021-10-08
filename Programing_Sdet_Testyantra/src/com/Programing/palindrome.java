package com.Programing;

public class palindrome {
	public static void main(String[]args) {
		int num=121,rem, rev=0;
		int t=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(t==rev) {
			System.out.println("palindrome");
			
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}

