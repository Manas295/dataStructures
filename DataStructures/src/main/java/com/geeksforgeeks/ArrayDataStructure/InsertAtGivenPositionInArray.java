package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class InsertAtGivenPositionInArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		System.out.println(insert(arr,4,50,10,4));
		Arrays.stream(arr).forEach(System.out :: println);
				
	}
	
	//Time complexity : O(n)
	static int insert (int arr[], int n, int x, int capacity, int pos) {
		
		if(n==capacity) {
			return n;
		}
		int index = pos-1; // array pos start with 0
		for(int i=n-1 ; i>=index ; i--) {
			arr[i+1] = arr[i]; //shifting of existing values
		}
		arr[index] = x;
		return n+1;
	}

}
