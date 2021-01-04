package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
//		점수를 입력해 주세요: (0~100)
//		90점 이상 A
//		80점 이상 B
//		70점 이상 C
//		나머지는 D입니다. ( +, - 없다) 
//		 		
//		100 초과면 잘못 입력하였습니다.
//
//		일의 자리 수가 7점 이상이면 +
//		일의 자리 수가 3점 이하이면 -
//		 		
//		예를 들어, 95점: A, 97점: A+, 83점: B-
//
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		String score = scan.next();
		
		int num = Integer.parseInt(score);
		
		if(num > 100 || num < 0) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}else if (num < 70) {
			System.out.println("D");
		}else if (num < 80) {
			System.out.println("C");
		}else if(num < 90) {
			System.out.println("B");
		}else { 
			System.out.println("A");
		}
		
		if(num == 100) {
			System.out.print("+");
		}else if ( num > 70 && num <= 100) {
			int mod = num % 10;
		}
		if( mod >= 7) {
			System.out.print("+입니다.");
		}
		else if ( mod >= 3) {
			System.out.print("-입니다.");
		}
	}
}