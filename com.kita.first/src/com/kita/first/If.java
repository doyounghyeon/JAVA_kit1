package com.kita.first;

public class If {
	public static void main(String[] arg) {
		
		int n1 = 4;
		int n2 = 2;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
//		if(조건식) { 
//			
//		}
		
		String oddNum = "짝수";
		
		if(n1 % 2 == 1) {
			oddNum = "홀수";
		} 
		System.out.printf("%d는 %s입니다.\n",n1, oddNum);
		
		
		// if ~ else if ~ else 문
		
		if(n1>n2) {
			System.out.println("n1이 n2보다 크다.");	
		} else if(n1==n2) {
			System.out.println("n1이 n2보다 같다.");
		}else {
			System.out.println("n1이 n2보다 작다.");
		}
		
		
		
		
}
}
