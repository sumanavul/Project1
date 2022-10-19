package com.map;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1, "January");
		ht.put(4, "April");
		ht.put(6, "June");
		ht.put(8, "August");
		ht.put(12, "December");
		System.out.println("Hashtable:"+ht);
		for (Map.Entry t : ht.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
			
		}
		System.out.println(ht.getOrDefault(6, "Not found"));
		System.out.println(ht.getOrDefault(9, "Not found"));
		System.out.println("Before remove: "+ht);
		ht.remove(12);
		System.out.println("After remove: "+ht);
		ht.putIfAbsent(3, "March");
		System.out.println("Updated map:"+ht);

	}

}
