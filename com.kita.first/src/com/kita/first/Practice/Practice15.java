package com.kita.first.Practice;

public class Practice15 {
	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
	int star = 4;
		for(int i = 0;i < star; i++) {
			for(int j =0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// "심화"
		// for문의 역할은 *개수 지정
		for(int i = 1; i <= star * star; i++) {
			System.out.print("*");
			if(i % star == 0) {         // 나머지가 0이면 대행
				System.out.println();
			}
		}
		
		System.out.println();
		
		// *
		// **
		// ***
		// ****
		star = 5;
		for(int i = 0; i <star; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
