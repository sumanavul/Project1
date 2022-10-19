package com.comparable;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s) {
		if (age == s.age)
			return 0;
		else if (age > s.age)
			return 1;
		else
			return -1;
	
//		if (age==s.age) {
//			return 0;
//		} else if(age<s.age) {
//            return 1;
//		} else {
//			return -1;
//		}

	}

}
