package com.kita.first.Practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {

//    스캐너로 정수값 하나 입력 받고
//	  그 값이 홀수면 "홀수입니다."
//	  짝수면 "짝수입니다."
	
	
		
Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(num);
		
		String Num = "짝수";
		
		if(num % 2 == 1) {
			Num = "홀수";
		} 
		System.out.printf("%s입니다.\n", Num);
		
		scan.close();
		
		
		
		
}
}
