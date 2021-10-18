package com.Programing;

public class Sqaurepateern {

	public static void main(String[] args) {
		for(int rows=1;rows<=5;rows++) {
			
			for(int col=1;col<=5;col++) {
				
				if(col==3||rows==3||rows==1||rows==5||col==1||col==5) {
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
