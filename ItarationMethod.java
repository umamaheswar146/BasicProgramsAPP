package com.regnant;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

public class ItarationMethod {

	public static void main(String[] args) {

		List<String> user = new ArrayList<String>();

		user.add("uma");

		user.add("koti");

		user.add("ravi");

		for (String x : user) {

			System.out.println("Using For Loop " + x);
		}

		System.out.println("-------------------------");

		Iterator it = user.iterator();

		while (it.hasNext()) {

			String s = (String) it.next();

			System.out.println("Using Iteration concept :" + s);

		}

	}

}