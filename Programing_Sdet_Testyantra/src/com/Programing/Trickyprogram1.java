package com.Programing;

public class Trickyprogram1 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int rows=1;rows<=n;rows++) {
			int temp=rows;
			int temp2=n-1;
			
			for(int col=1;rows>=col;col++) {
				System.out.print(temp + " ");
				temp=temp+temp2--;
				
			}
			 System.out.println();
		}
		 

	}

}
