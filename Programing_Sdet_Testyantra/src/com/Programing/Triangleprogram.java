package com.Programing;

public class Triangleprogram {

	public static void main(String[] args) {
		
		for(int rows=1;rows<=4;rows++) {
			
			for(int col=1;col<=4;col++) {
				if(rows>=col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
