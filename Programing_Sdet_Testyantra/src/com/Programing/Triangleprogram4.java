package com.Programing;

public class Triangleprogram4 {

	public static void main(String[] args) {
		int n=4;
		
		for(int rows=1;rows<=n;rows++) {
			
			for(int col=1;col<=n;col++) {
				if(rows+col>=n+1) {
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
