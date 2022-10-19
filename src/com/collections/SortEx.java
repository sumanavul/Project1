package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir"); 
		Collections.sort(al);
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("Reverse the list:");
		Collections.sort(al, Collections.reverseOrder());
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
