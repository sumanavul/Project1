package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Java");
		li.add("Python");
		li.add("C++");
		li.add("DS");
		System.out.println("Initial collection value:"+li);
		Collections.addAll(li,"Servlets", "JSP");
		System.out.println("After adding elements collection value:"+li);  
		String[] str = {".NET","SAP"};
		Collections.addAll(li, str);
		System.out.println("After adding array collection value:"+li);

	}

}
