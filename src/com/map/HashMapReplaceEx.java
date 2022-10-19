package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplaceEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Kadapa");
		map.put(2, "Anantapur");
		map.put(3, "Kurnool");
		map.put(4, "Chittor");
		System.out.println("Initial list of elements:");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Updated list of elements:"); 
		map.replace(2, "Nellore");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Updated list of elements:"); 
		map.replace(3, "Kurnool", "Thirupathi");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Updated list of elements:");
		map.replaceAll((k,v) -> "vijayawada");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
