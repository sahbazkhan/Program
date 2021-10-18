package com.Programing;

public class Trickyprogram {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		int temp=2;
		
		for(int rows=1; rows<=n;rows++) {
			
			for(int col=1; rows>=col;col++) {
				System.out.print(count--+" ");
				
				
			}
			count=count+rows+temp++;
			System.out.println();
			
		}

	}

}
