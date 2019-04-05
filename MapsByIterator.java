package com.regnant;

import java.util.HashMap;

import java.util.Map;

import java.util.Set;

import java.util.Iterator;

public class MapsByIterator {

	public static void main(String[] args) {

		Map<Integer, String> user = new HashMap<Integer, String>();

		user.put(1, "Umamaheswar");

		user.put(2, "koti");

		user.put(3, "ravi");

		for (Map.Entry entry : user.entrySet()) {

			Integer i = (Integer) entry.getKey();

			String s = (String) entry.getValue();

			System.out.println("using Entry The valve are :" + i + " " + s);

		}

		System.out.println("-------------------------------------------------");

		Set<Integer> keyset = user.keySet();

		Iterator it = keyset.iterator();

		while (it.hasNext()) {

			Integer i = (Integer) it.next();

			String s = (String) user.get(i);

			System.out.println("using Iterarion the valves are :" + i + " " + s);

		}

		System.out.println("-------------------------------------------------");

		for (Integer i : user.keySet()) {

			String s = user.get(i);

			System.out.println("Using for each loop :" + i + "  " + s);
		}

	}

}