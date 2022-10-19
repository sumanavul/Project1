package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
