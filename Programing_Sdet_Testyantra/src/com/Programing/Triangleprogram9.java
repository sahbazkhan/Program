package com.Programing;

public class Triangleprogram9 {

	public static void main(String[] args) {
		int n=4;
		char ch1='A';
		char ch2='a';
		
		for(int rows=1;rows<=n;rows++) {
			
			for(int col=1;col<=n;col++) {
				if(rows>=col) {
					System.out.print(ch1++ +""+ ch2++ +" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
