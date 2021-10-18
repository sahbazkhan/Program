package com.Programing;

public class Pyramidpateern1 {

	public static void main(String[] args) {
		int n=3;
		for(int rows=n;rows>=1;rows--) {
			for(int space=1;space<=n-rows;space++) {
				System.out.print("  ");
				
			}
			for(int star=1;(2*rows)>star;star++) {
				System.out.print("* ");
			}
			 System.out.println();
		} 
		
	}

}
