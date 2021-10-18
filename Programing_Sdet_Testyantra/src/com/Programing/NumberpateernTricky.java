package com.Programing;

public class NumberpateernTricky {

	public static void main(String[] args) {
		int count=1;
		for(int rows=1;rows<=5;rows++) {
			
			for(int col=1;col<=5;col++) {
				System.out.print(count++ +" ");
			}
			if(rows<=2) {
				count=count+5;
			}
			else if(rows==3) {
				count=count-10;
			}
			else {
				count=count-15;
			}
			
			System.out.println();
		}

	}

}
