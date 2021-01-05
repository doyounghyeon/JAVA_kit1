package com.kita.first.Practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		// 1 ~ 12월
		// 3 ~ 5 : 봄
		// 6 ~ 8 : 여름
		// 9 ~ 11 : 가을
		// 12 ~ 2 : 겨울
		
		// n월은 oo입니다.
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		String weather;
		
		switch(num) {
		case 12: case 1: case 2: 
			weather = "겨울";
			break;
		case 3: case 4: case 5:
			weather = "봄";
			break;
		case 6: case 7: case 8: 
			weather = "여름";
			break;
		default : 
			weather = "가을";
		}
		System.out.printf("%d월은 %s입니다.",num,weather);
		
		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		scan.close()
//		String weather;
//		
//		//int monthNum = Integer.parseInt(month);
//		
//		if(num == 1 || num == 2 || num == 12) {
//			 weather = "겨울";
//		}else if (num == 3 || num == 4 || num == 5) {
//			weather = "봄";
//		}else if (num == 6 || num == 7 || num == 8) {
//			weather = "여름";
//		}else {
//			weather = "가을";
//		}
//		System.out.printf("%d월은 %s입니다.",num,weather);
//		
		
		
		
	}
}
