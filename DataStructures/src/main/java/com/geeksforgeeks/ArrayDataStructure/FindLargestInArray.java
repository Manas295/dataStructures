package com.geeksforgeeks.ArrayDataStructure;

public class FindLargestInArray {

	public static void main(String[] args) {
		int arr[] = {5,8,20,10};
		int index = getLargest(arr);
		System.out.println("Largest element at index "+index+" is : "+arr[index]+"");
	}

	static int getLargest(int arr[]) {
		int res =0 ;
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[res] < arr[i])
				res = i; 
		}
		return res;
	}
}
