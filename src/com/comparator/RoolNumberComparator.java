package com.comparator;

import java.util.Comparator;

public class RoolNumberComparator implements Comparator<Student> {
  public int compare(Student s1, Student s2) {
	  if(s1.rollno==s2.rollno)
		  return 0;
	  else if(s1.rollno>s2.rollno)
		  return 1;
	  else
		  return -1;
				 
  }
}
