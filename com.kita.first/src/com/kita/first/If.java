package com.kita.first;

public class If {
	public static void main(String[] arg) {
		
		int n1 = 2;
		int n2 = 3;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
//		if(조건식) { 
//			
//		}
		
		String oddNum;
		
		if(n1 % 2 == 1) {
			oddNum = "홀수";
		} else {
			oddNum = "짝수";
		}
		System.out.printf("%d는 %s입니다.",oddNum);
}
