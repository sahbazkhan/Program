package com.Programing;

public class Alphabetpateern {

	public static void main(String[] args) {
		char count='A';
		for(int rows=1;rows<=5;rows++) {
			
			for(int col=1;col<=5;col++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
