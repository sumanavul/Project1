package com.map;

import java.util.EnumMap;
import java.util.Map;

enum Days{
	MONDAY,TEUSDAY,WEDNESDAY,THURSDAY;
}
public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
		map.put(Days.MONDAY, "1");
		map.put(Days.TEUSDAY, "2");
		map.put(Days.WEDNESDAY,"3");
		map.put(Days.THURSDAY, "4");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
