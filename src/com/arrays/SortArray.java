package com.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {5,8,20,14,-6,11,9,27};
		int temp =0;
//		Arrays.sort(arr);
//		System.out.println("Printing elements after sorting:");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
				    arr[i] = arr[j];
				    arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
