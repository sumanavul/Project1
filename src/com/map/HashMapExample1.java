package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Suman");
		map.put(3, "Krish");
		map.put(4, "Anu");
		map.put(5, "Sivani");
		map.put(1, "Suman");// duplicate key
		System.out.println("Iterating Hashmap:");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
