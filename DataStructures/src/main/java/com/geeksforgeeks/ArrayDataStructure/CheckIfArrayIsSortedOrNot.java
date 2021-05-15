package com.geeksforgeeks.ArrayDataStructure;

public class CheckIfArrayIsSortedOrNot {

	public static void main(String[] args) {

		int arr1[] = {5,12,30,2,35};
		System.out.println("Array1  is sorted or not : "+isSorted(arr1)+"");
		int arr2[] = {8,12,15,20,24};
		System.out.println("Array2  is sorted or not : "+isSorted(arr2)+"");
	}

	static boolean isSorted(int arr[]) {
		for(int i=1 ; i< arr.length ; i++) {
			if(arr[i] < arr[i-1])
				return false;
		}
		return true;
	}
}
