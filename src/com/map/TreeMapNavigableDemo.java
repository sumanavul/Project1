package com.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapNavigableDemo {

	public static void main(String[] args) {

     NavigableMap<Integer, String> nm = new TreeMap<Integer, String>();
     nm.put(1,"Red");
     nm.put(2, "Orange");
     nm.put(3, "Yellow");
     nm.put(4, "Green");
     nm.put(5, "White");
     System.out.println("Descending map: "+nm.descendingMap());
     System.out.println("Head map: "+nm.headMap(3, true));
     System.out.println("Tail map: "+nm.tailMap(2, false));
     System.out.println("sub map: "+nm.subMap(2, 5));

	}

}
