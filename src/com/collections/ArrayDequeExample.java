package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("Sai");
		d.add("Hari");
		d.add("Krish");
		d.add("Venky");
		d.offerFirst("Vivek");
		for (String s : d) {
			System.out.println(s);
		}
		d.pollLast();
		System.out.println("After polling last:");
		for (String s : d) {
			System.out.println(s);
		}

	}

}
