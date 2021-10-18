package com.Programing;

public class Triangleprogram7 {

	public static void main(String[] args) {
		
		//char count='A';
		int n=4;
		
		for(int rows=1;rows<=n;rows++) {
			int count=1;
			
			for(int col=1;col<=n;col++) {
				if(rows>=col) {
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
