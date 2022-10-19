package com.java8comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101,"Vijay",23));    
		al.add(new Student(106,"Ajay",27));    
		al.add(new Student(105,"Jai",21));
		//Sorting elements on the basis of name 
		Comparator<Student> cm1 = Comparator.comparing(Student::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by name");
		for (Student s : al) {
			System.out.println(s.roolno+" "+s.name+" "+s.age);
		}
		Comparator<Student> cm2 = Comparator.comparing(Student:: getAge);
		System.out.println("Sorting by age:");
		Collections.sort(al, cm2);
		for (Student s : al) {
			System.out.println(s.roolno+" "+s.name+" "+s.age);
		}
		Comparator<Student> cm3 = Comparator.comparing(Student:: getRoolno);
		System.out.println("Sorting by roolno:");
		Collections.sort(al, cm3);
		for (Student s : al) {
			System.out.println(s.roolno+" "+s.name+" "+s.age);
		}
	}

}
//output:
//Sorting by name
//106 Ajay 27
//105 Jai 21
//101 Vijay 23
//Sorting by age:
//105 Jai 21
//101 Vijay 23
//106 Ajay 27
//Sorting by roolno:
//101 Vijay 23
//105 Jai 21
//106 Ajay 27

