package com.Programing;

public class Pyramidpateern4 {

	public static void main(String[] args) {
		int n=3;
		//int count=1;
		for(int rows=1;rows<=n;rows++) {
			int count=1;
			for(int space=1;space<=n-rows;space++) {
				System.out.print("  ");
				
			}
			for(int star=1;(2*rows)>star;star++) {
				System.out.print(count++ +" ");
			}
			 System.out.println();
		} 
		
	}

}
