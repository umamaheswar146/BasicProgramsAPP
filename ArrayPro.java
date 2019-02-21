package com.regnant;

public class ArrayPro {
	
	public static void main(String[] args) {
		
	//Print array elements
	
	int [] Uma = {17,18,10,15,18};
	
	
	for(int i=0;i< Uma.length;i++) {
		
		   
		System.out.println(Uma[i]);
		
	}
	
	
	System.out.println();
	
	//Print even numbers in array
	
	int [] Uma1 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=0;i< Uma1.length;i++) {
		
		if( Uma1[i]%2==0) {
		
		   
		System.out.println(Uma1[i]);
		
		}
	}
	
	System.out.println();
	
	//Print odd numbers in array

	
int [] Uma2 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=0;i< Uma2.length;i++) {
		
		if( Uma2[i]%2!=0) {
		
		   
		System.out.println(Uma2[i]);
		
		}
	}
	
	System.out.println();
	
	//Print elements at even index in array
	
int [] Uma3 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=0;i< Uma3.length;i++) {
		
		if( i%2==0) {
		
		   
		System.out.println(Uma3[i]);
	
	
	
		}
	}
	
	System.out.println();
	
	//Print elements at odd index in array

	
int [] Uma4 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=0;i< Uma4.length;i++) {
		
		if( i%2!=0) {
		
		   
		System.out.println(Uma4[i]);
	
	
		}
		
	}
	
	//Print elements  right to left from middle

	
	System.out.println();

	
int [] Uma5 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=Uma5.length/2;i< Uma5.length;i++) {
		
	
		
		   
		System.out.println(Uma5[i]);
	
	
	}
	
	
	System.out.println();
	
	//Print elements  left to right from middle
	
int [] Uma6 = {17,18,10,15,18,12,17,8,5,4};
	
	
	for(int i=Uma6.length/2;i>=0 ; i--) {
		
	
		   
		System.out.println(Uma6[i]);
	}
	
	
	
	System.out.println();
	
	//Print the Alternate Elements in an Array
	
	int [] Uma7= {17,18,10,15,18,12,17,8,5,4};
		
		
		for(int i=0;i<Uma7.length ; i++) {
			
		if(i%2==0) {
			   
			System.out.println(Uma7[i]);
		}
		
		}
	}

}
