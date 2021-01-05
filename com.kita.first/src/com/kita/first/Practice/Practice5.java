package com.kita.first.Practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
//		수학 응시 유형을 입력해 주세요 : (가/나)
//		점수를 입력해 주세요:
//			
//		가형 기준 : 60
//		나형 기준 : 70
//		
//		"평균 미만입니다."
//		"평균 입니다."
//		"평균 초과입니다"
		
        Scanner scan = new Scanner(System.in);
	    System.out.println("수학 응시 유형을 입력해 주세요 :  (가/나)");
		String mathType = scan.next();
	    System.out.println("점수를 입력해 주세요 : ");
		int score = scan.nextInt();
		
		int defaultScore = 70;
		
		
//		if("가".equals(mathType)) {
//			if(score > 60) {
//				System.out.println("평균 초과입니다.");
//			}else if(score < 60) {
//				System.out.println("평균 이하입니다.");
//			}else {
//				System.out.println("평균입니다.");
//			}
//		}
//		if("나".equals(mathType)) {
//			if(score > 70) {
//				System.out.println("평균 초과입니다.");
//			}else if(score < 70) {
//				System.out.println("평균 이하입니다.");
//			}else {
//				System.out.println("평균입니다.");
//			}
//		}
		
		
	if("가".equals(mathType) || "나".equals(mathType)) {
		if("가".equals(mathType)) {
			defaultScore = 60;
			}
		
		if(score > defaultScore) {
			 System.out.println("평균 초과입니다.");
		}else if (score < defaultScore) {
			System.out.println("평균 미만입니다.");
		}else {
			System.out.println("평균 입니다.");
		} 
	}
	else {
		System.out.println("잘못입력 하셨습니다.");
	
		}
	
	}


}

