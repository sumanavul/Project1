package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Suman");
		tm.put(2, "Satwik");
		tm.put(3, "Saketh");
		tm.put(4, "Sai");
		tm.put(5, "Sri");
		System.out.println("Intial tree map:"+tm);
		for (Map.Entry t : tm.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
		System.out.println("Before removing the elements:");
		for (Map.Entry t : tm.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
		tm.remove(5);
		tm.remove(3, "Saketh");
		System.out.println("After removing elements:");
		for (Map.Entry t : tm.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
	}

}
