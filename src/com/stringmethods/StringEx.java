package com.stringmethods;

public class StringEx {

	public static void main(String[] args) {
		String str = "My name is suman";
		String substring=str.substring(4, 8);
		System.out.println(substring);
		System.out.println(str.substring(3, 7));
		System.out.println("Sub string:"+str.substring(5));
		System.out.println("String with out spaces:"+str.trim());
		System.out.println("String with lower case:"+str.toLowerCase());
		System.out.println("String with upper case:"+str.toUpperCase());
		System.out.println("String length:"+str.length());
		System.out.println("Cahar at String: "+str.charAt(6));
		System.out.println("Index of string: "+str.indexOf('s'));
        System.out.println("String contains: "+str.contains("is"));
        System.out.println("String ends with: "+str.endsWith("man"));
        System.out.println("String starts with: "+str.startsWith("My"));
        System.out.println("String split:"+str.split(" ").length);
        System.out.println("tring is empty:"+str.isEmpty());
	}

}
