package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
		System.out.println("Sorting by age:");
		Collections.sort(al, new AgeComparator());
		for (Student s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		System.out.println("Sorting of roolno:");
		Collections.sort(al, new RoolNumberComparator());
		for (Student s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		System.out.println("Sorting by name:");
		Collections.sort(al, new NameComparator());
		for (Student s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}

	}

}
