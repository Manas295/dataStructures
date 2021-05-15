package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class LeftRotateArrayBy1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		leftRotate(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void leftRotate(int arr[]) {
		int tmp = arr[0];
		for(int i=1 ; i< arr.length ; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tmp;
	}
}
