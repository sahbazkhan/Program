package com.Programing;

public class ReverseStringOfwithoutlengthandvaraibale {

	public static void main(String[] args) {
		String s="India";
		char c[]=s.toCharArray();
		int count=0;
		for(char b:c) {
			count++;
		}
		//System.out.println(count);

	
	for(int i=count-1;i>=0;i--) {
		System.out.print(c[i]);
	}

}
}
