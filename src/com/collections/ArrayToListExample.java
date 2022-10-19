package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {
		String[] array = {"Java","Python","C++","PHP"};
		System.out.println("Printing array:"+Arrays.toString(array));
		//Converting Array to List 
		List<String> list = new ArrayList<String>();
        for (String lang : array) {
        	
			list.add(lang);
		}
        System.out.println("Printing List: "+list);
	}
}
