package com.kita.first.Practice;

public class Practice17 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		int star = 5;
//			for(int i = 0; i < star; i++) {
//				for(int j = 0; j < i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//		}
//		
		
		
		
		
		
		
//		star = 4;
//		int line = 1;
//		int st = 0;
//		
//		for(int i = 1; i <= star*star; i++) {
//				System.out.print("*");
//				st++;
//			if(st == line) {
//				System.out.println();
//				line++;
//				st = 0;
//			}
//			if(line > star) {
//				break;
//			}
//		}
		
		
		
		

		

		
		
//		star = 4;
//		for(int  i = 1, j = 1; i <= star*(star + 1) / 2; i++) {
//			System.out.print("*");
//			if(i == j * (j + 1) / 2) {
//				System.out.println();
//				j++;
//			}
//		}
		
		
		star = 4;
		for(int i=1; i <= star; i++) {
			for(int j = star; j > 0 ; j--) {
				System.out.print(i<j? "" : "*");
				/*
				if(i<j) {
					System.out.print("*");
				}else {
					System.out.print("*");
				}
				*/
			}
			System.out.println();
		}
		
		
	}
}

		
