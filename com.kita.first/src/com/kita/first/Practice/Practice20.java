package com.kita.first.Practice;

public class Practice20 {
	public static void main(String[] args) {
		// while문에 조건식을 사용하요
		// 1~100을 모두 더한 값이 출력되도록 하세요
		// 합계 : 5050
		 int n=0;
		 int s = 0;
		 while(n<100){    
		   n++;
		   s+=n;
		  }
		  System.out.println("합계 : " + s);
	}
}
