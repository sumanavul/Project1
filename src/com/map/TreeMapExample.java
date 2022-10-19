package com.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<>();
		t.put("AP", "Vijayawada");
		t.put("KA", "Bangalore");
		t.put("TN", "Chennai");
		t.put("Kl", "Tiruvanatapuram");
		System.out.println("Original Map:"+t);
		System.out.println("Head map:"+t.headMap("TN"));
		System.out.println("Tail map:"+t.tailMap("KA"));
		System.out.println("Sub map"+t.subMap("KA", "TN"));

	}

}
