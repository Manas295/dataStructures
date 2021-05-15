package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {30,7,6,5,10};
		reverse(arr);

	}
	
	static void reverse(int arr[]) {
		int low =0, high = arr.length-1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
    
}
