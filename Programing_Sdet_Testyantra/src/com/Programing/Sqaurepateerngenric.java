package com.Programing;

public class Sqaurepateerngenric {

	public static void main(String[] args) {
		int n=5;
		for(int rows=1;rows<=n;rows++) {
			
			for(int col=1;col<=n;col++) {
				
				if(col==((n/2)+1)||rows==((n/2)+1)||rows==1||rows==n||col==1||col==n) {
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
