package com.regnant;


import java.util.LinkedList;

public class collectionLinkedlist {

	public static void main(String[] args) {

		LinkedList<String> addandremove = new LinkedList<String>();

		addandremove.add("koti");
		
		addandremove.add("uma");
		
		addandremove.add("vamsi");
		
		addandremove.add("ravi");
		
		addandremove.remove(0);
		
		addandremove.remove(1);

		for (String x : addandremove) {


			System.out.println( x);
		}

	}
}