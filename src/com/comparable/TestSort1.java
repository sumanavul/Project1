package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
//		al.add(new Student(101,"Vijay",23));
//		al.add(new Student(106,"Ajay",27));
//		al.add(new Student(105,"Jai",21)); 
		Student s1 = new Student(101,"Vijay",23);
		Student s2 = new Student(106,"Ajay",27);
		Student s3 = new Student(105,"Jai",21);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
