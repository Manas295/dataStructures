package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class DeletionInArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		System.out.println(delete(arr,5,20));
		Arrays.stream(arr).forEach(System.out :: println);

	}

	static int delete(int arr[],int n, int x) {
		int i;
		for(i=0;i<n;i++) {
			if(arr[i] == x)
				break;
		}
		if(i==n) {
			return n;
		}
		for(int j=i ; j<n-1 ; j++)
			arr[j] = arr[j+1];
		return n-1;
	}
}
