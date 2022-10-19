package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + " " + m.getValue());
		}
		hm.putIfAbsent(103, "Gourav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);
	      System.out.println("After invoking putAll() method");
	      for (Map.Entry m  : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
