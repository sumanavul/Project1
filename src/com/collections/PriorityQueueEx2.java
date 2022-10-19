package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

class Book2 implements Comparable<Book2>{
	int id;
	String name,author,publisher;  
	int quantity;
	public Book2(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int compareTo(Book2 b) {
		if (id>b.id) {
			return 1;
		} else if(id<b.id){
          return -1;
		} else {
			return 0;
		}
	}
}
public class PriorityQueueEx2 {

	public static void main(String[] args) {
		Queue<Book2> pq = new PriorityQueue<Book2>();
		Book2 b1 = new Book2(121,"Let us C","Yashwant Kanetkar","BPB",8);
		Book2 b2 = new Book2(233,"Operating System","Galvin","Wiley",6);
		Book2 b3 = new Book2(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		  System.out.println("Traversing the queue elements:");  
		    //Traversing queue elements  
		    for(Book2 b:pq){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		    pq.remove();  
		    System.out.println("After removing one book record:");  
		    for(Book2 b:pq){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		        }  

	}

}
