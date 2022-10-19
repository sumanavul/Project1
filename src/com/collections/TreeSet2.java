package com.collections;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("A");
		set.add("N");
		set.add("G");
		set.add("C");
		set.add("L");
		System.out.println("Original Set:"+set);
		System.out.println("Reverse set:"+set.descendingSet());
		System.out.println("Head set:"+set.headSet("G", true));
		System.out.println("Sub set:"+set.subSet("A", "L"));
		System.out.println("Trail set:"+set.tailSet("C", true));

	}

}
