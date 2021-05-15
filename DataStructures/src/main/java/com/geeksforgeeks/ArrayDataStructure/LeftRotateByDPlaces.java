package com.geeksforgeeks.ArrayDataStructure;

import java.util.Arrays;

public class LeftRotateByDPlaces {
	public static void main(String[] args) {
		//Method 1 ---- NAIVE
		int arr1[] = {1,2,3,4,5};
		leftRotate(arr1, arr1.length, 2);
		System.out.println("Method 1 "+Arrays.toString(arr1));
		
		int arr2[] = {1,2,3,4,5};
		leftRotate2(arr2, arr2.length, 2);
		System.out.println("Method 2 "+Arrays.toString(arr2));
		
		int arr3[] = {1,2,3,4,5};
		leftRotate3(arr3, arr3.length, 2);
		System.out.println("Method 3 "+Arrays.toString(arr3));

	}
	//Method 1 --- Naive
	static void leftRotate1(int arr[]) {
		int tmp = arr[0];
		for(int i=1 ; i< arr.length ; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tmp;
	}
	//Method 1 ---Naive
	static void leftRotate(int arr[],int n, int d) {
		for(int i=0 ; i<d ; i++) {
			leftRotate1(arr);
		}
	}
	
	//Method 2 ---- Better
	static void leftRotate2(int arr[] , int n , int d) {
		int []temp = new int[d];
		for(int i=0 ; i<d ; i++) {
			temp[i] = arr[i];
		}
		for(int i=d ; i<n; i++) {
			arr[i-d] = arr[i];
		}
		for(int i=0 ; i<d ; i++) {
			arr[n-d+i] = temp[i];
		}
		
	}
	
	//Method 3  ---- Reversal Algo
	static void leftRotate3(int arr[], int n , int d) {
		reverse(arr, 0, d-1);  //first 'd' elements
		reverse(arr,d,n-1); // from d to n-1
		reverse(arr,0,n-1);// whole array
	}
	static void reverse(int arr[], int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	

}
