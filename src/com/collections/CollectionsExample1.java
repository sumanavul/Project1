package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {

	public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(20);
    list.add(65);
    list.add(117);
    list.add(29);
    list.add(33);
    System.out.println("Maximum nuber in the list: "+Collections.max(list));
    System.out.println("Minimaum element in the list: "+Collections.min(list));

	}

}
