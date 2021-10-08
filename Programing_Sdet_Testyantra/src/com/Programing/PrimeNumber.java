package com.Programing;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=5,temp=0;
		for(int i=2; i<=num-1; i++) {
			if(num%i==0) {
				temp=temp+1;
			}
			if(temp==0) {
				System.out.println(num+ "not primre");
			}
			else {
				System.out.println(num+ "no is prime");
			}
		}
			
		}
}