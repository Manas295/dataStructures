package com.geeksforgeeks.ArrayDataStructure;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,30};
		int result  = removeDup(arr);
		for(int i = 0; i<result ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int removeDup(int arr[]) {
		int res =1;
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[res-1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
	return res;
	}

}
