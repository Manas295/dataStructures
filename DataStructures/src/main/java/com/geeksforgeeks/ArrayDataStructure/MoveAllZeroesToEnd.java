package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int arr[] = {10,8,0,0,12,0};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void moveZeroes(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i = 0 ; i<n ; i++) {
			if(arr[i] != 0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}

}
