package com.Programing;

public class Triangleprogram6 {

	public static void main(String[] args) {
		int count=1;
		//char count='A';
		int n=4;
		
		for(int rows=1;rows<=n;rows++) {
			
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
