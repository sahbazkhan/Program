package com.Programing;

public class SortingOfSequence {
	public static void main(String[] args) {
		int a[]= {30,0,43,0,20,0,23,0,47};
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
            
	
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
}

}
