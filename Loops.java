package com.regnant;

public class Loops {
	
//Numbers From 1 to 10
	
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}

		System.out.println();
		
		//Numbers From 10 to 1

		for (int i = 10; i >= 0; i--) {

			System.out.println(i);

		}

		System.out.println();
		
		//Print Even Number

		int[] array = { 12, 9, 4, 6, 3, 1, 9, 45 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.println(array[i]);
			}

		}
		
		//Print odd Numbers

		System.out.println();

		int[] odd = { 12, 9, 4, 6, 3, 1, 9, 45 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {

				System.out.println(array[i]);
			}

		}
		
		
		//Alternate Numbers

		System.out.println();

		int[] Alternate = { 12, 9, 4, 6, 3, 1, 9, 45 };

		for (int i = 0; i < Alternate.length; i++) {

			if (i % 2 == 0) {

				System.out.println(Alternate[i]);

			}

		}
		System.out.println();
		
		//Middle to Right Numbers

		int[] x = { 7, 3, 13, 14, 9, 21, 78, 28, 35, 42, 49 };

		for (int i = x.length/2; i < x.length; i++) {


				System.out.println(x[i]);

			

		}
		System.out.println();
		
		//middle to Left Numbers

		int[] FrentNumber = { 7, 3, 13, 14, 9, 21, 78, 28, 35, 42, 49 };

		for (       int i = x.length/2; i >=0; i--    ) {

			System.out.println(FrentNumber[i]);

		}
		

	}

}
