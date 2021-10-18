package com.Programing;

public class Triangleprogram8 {

	public static void main(String[] args) {
		int n=4;
		
		for(int rows=1;rows<=n;rows++) {
			int count=1;
			
			for(int col=1;col<=n;col++) {
				if(rows+col>=n+1) {
					System.out.print(count++ +" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
