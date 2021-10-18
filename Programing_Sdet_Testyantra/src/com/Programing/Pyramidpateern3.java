package com.Programing;

public class Pyramidpateern3 {

	public static void main(String[] args) {
		int n=3;
		for(int rows=1;rows<=n;rows++) {
			for(int space=1;space<=n-rows;space++) {
				System.out.print("  ");
				
			}
			for(int star=1;(2*rows)>star;star++) {
				if(star==1 || star==(2*rows)-1)
				{
					System.out.print("* ");	
				}
				else  
				{
					System.out.print("  ");
				}
				
			}
			 System.out.println();
		} 
		for(int rows=n-1;rows>=1;rows--) {
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


