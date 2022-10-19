package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Suman");
		queue.add("Sai");
		queue.add("Sivani");
		queue.add("Anu");
		queue.add("Kala");
		queue.add("Venky");
		System.out.println(queue);
		System.out.println("Head: "+queue.element());
		System.out.println("Head "+queue.peek());
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        queue.remove();
        queue.poll();
        System.out.println("After removing elements: "+queue);
        Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
