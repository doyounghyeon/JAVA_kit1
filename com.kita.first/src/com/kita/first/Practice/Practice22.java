package com.kita.first.Practice;

public class Practice22 {
	public static void main(String[] args) {
		// 정수 배열 만들어서
		// 1~100까지 값을 각각 배열안에 넣고
		// 배열 안에 든 값을 찍어보자.
		// 1, 2, 3 ,... , 100
		
		int arr[] = new int[100];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i +1;
		}
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < 100) {
				System.out.print(arr[i] + ", ");
			}else
			System.out.print(arr[i]);
		}
		
		
	}
}
