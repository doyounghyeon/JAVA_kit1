package com.kita.first.Practice;

public class Practice27 {
	public static void main(String[] args) {
		// {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}    {00 01 02} {10 11 12} {20 21 22} {30 31 32}
		int[][] arr = new int [4][3];                        // n n+1 n+2 ...
		int n=1;
		for(int i=0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = n;
				n++;
			}
		}
		for(int i=0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
