package com.geeksforgeeks.ArrayDataStructure;

public class FindSecondLargest {

	public static void main(String[] args) {

		int arr[] = {5,8,20,10};
		int index = getSecondLargest(arr);
		System.out.println("Second Largest element at index "+index+" is : "+arr[index]+"");
	}

	static int getSecondLargest(int arr[]) {
		int res=-1, largest=0;
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i]!=arr[largest]) {
				if(res == -1 || arr[i] > arr[res]) {
					res = i ;
				}
			}
		}
		System.out.println("Largest element at index "+largest+" is : "+arr[largest]+"");
		return res ; 
	}
}
