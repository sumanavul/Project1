package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Ram");
		ts.add("Siva");
		ts.add("Venky");
		ts.add("Vinayak");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through Iterator in descending order");
		Iterator i =ts.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        set.add(3);
        set.remove(3);
        for (Integer integer : set) {
			System.out.println(integer);
		}
        System.out.println("Lowest value:"+set.pollFirst());
        System.out.println("Highest value:"+set.pollLast());
	}

}
