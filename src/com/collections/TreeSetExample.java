package com.collections;

import java.util.Set;
import java.util.TreeSet;

class Book1 implements Comparable<Book1>{
	int id;    
	String name,author,publisher;    
	int quantity;
	public Book1(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public int compareTo(Book1 b) {    
	    if(id>b.id){    
	        return 1;    
	    }else if(id<b.id){    
	        return -1;    
	    }else{    
	    return 0;    
	    }    
	}    
}
public class TreeSetExample {

	public static void main(String[] args) {
		Set<Book1> set = new TreeSet<Book1>();
		Book1 b1 = new Book1(121,"Let us C","Yashwant Kanetkar","BPB",8);
		Book1 b2 = new Book1(233,"Operating System","Galvin","Wiley",6);
		Book1 b3 = new Book1(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book1 book1 : set) {
			System.out.println(book1.id+" "+book1.name+" "+book1.author+" "+book1.publisher+" "+book1.quantity+" ");
		}
	}

}
