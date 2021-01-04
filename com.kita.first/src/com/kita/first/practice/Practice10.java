package com.kita.first.practice;

import java.util.Scanner;

public class Practice10 {
	 public static void main(String[] args) {
		 
//			점수를 입력해 주세요: (0~100)
//			90점 이상 A
//			80점 이상 B
//			70점 이상 C
//			나머지는 D입니다. ( +, - 없다) 
//			 		
//			100 초과면 잘못 입력하였습니다.
	//
//			일의 자리 수가 7점 이상이면 +
//			일의 자리 수가 3점 이하이면 -
//			 		
//			예를 들어, 95점: A, 97점: A+, 83점: B-
	//
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.print("잘못 입력하였습니다");
			return;
		}
		
		String opt = "";
		int mod = score % 10;
		if (mod >= 7) {
			opt = "+";
		}else if (mod <= 3) {
			opt = "-";
	}

	 
	 switch (score / 10 ) {
	 case 10:
		 System.out.print("A+");
		 break;
	 case 9:
		 System.out.print("A" + opt);
		 break;
	 case 8:
		 System.out.print("B"+ opt);
		 break;
	 case 7:
		 System.out.print("C"+ opt);
		 break;
	 default :
		 System.out.print("D");
	 } 
}
}
