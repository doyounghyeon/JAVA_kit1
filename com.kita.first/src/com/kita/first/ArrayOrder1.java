package com.kita.first;

public class ArrayOrder1 {
	public static void main(String[] args) {
		int[] arr = {1, 7, 45, 0 , 2};
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		// {1, 7, 45, 0, 2}
		
		for(int i=0; i < arr.length-1; i++) {
			for(int j= i + 1; j< arr.length; j++){
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num+ ", ");
		}
	
	}
}
