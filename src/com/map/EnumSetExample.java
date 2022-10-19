package com.map;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days1{
	SUNDAY,MONDAY,TEUSDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumSetExample {

	public static void main(String[] args) {
		Set<Days> e = EnumSet.of(Days.TEUSDAY,Days.THURSDAY);
		Iterator<Days> itr = e.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// by using foreach loop
		for (Days d : e) {
			System.out.println(d);
		}
		Set<Days> set = EnumSet.allOf(Days.class);
		System.out.println("Weeek Days: "+set);
		Set<Days> set1 = EnumSet.noneOf(Days.class);
		System.out.println("Week Days: "+set1);
	}
}
