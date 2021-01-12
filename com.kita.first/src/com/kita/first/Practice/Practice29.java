package com.kita.first.Practice;


import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
//		숫자야구게임 시작 !
//		값1: 1
//		값2: 2
//		값3: 3
//		S: 0/ B: 1/ O: 2
//		값1: 4
//		값2: 5
//		값3: 6
//		S: 1/ B: 0/ O: 2
//		값1: 4
//		값2: 3
//		값3: 9
//		S: 3/ B: 0/ O: 0
//		End!
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;
		
		int[] rArr = new int[LEN]; 
		int[] myArr = new int[LEN];
		int str = 0;
		int ball = 0;
		int out = 0;
		
		
		
		System.out.println("숫자야구게임 시작 !");
		 int Max = 9;
		 int Min = 1;
		 
		for(int i=0; i< rArr.length; i++) {
			 rArr[i] = (int)(Math.random() * (Max - Min +1)) + Min;
			 	for(int j=0;j<i;j++) {
			 		if(rArr[i]==rArr[j]) {
			 			i--;
			 			break;
			 		}
			 	}
			 }
		 
		 while(true) {
//				값1: 1
//				값2: 2
//				값3: 3
//				S: 0/ B: 1/ O: 2
			 // 값 입력받는 반복문
			 
			 
			 // s, b 계산하는 반복문
			 
			 
			 // s: / b: / o:  출력
			 
			 // s==LEN 비교
			for(int i =0; i < LEN; i++) { 
				  System.out.printf("값%d : ",i + 1 );
				 myArr[i] = scan.nextInt();
				  for(int z=0;z<i;z++) {
					  if(myArr[z] == myArr[i]) {
						  System.out.println("중복된 숫자입니다.");
						  i--;
						  break;
					  }
				  }
			}
			 	 
			 for(int i=0; i< LEN; i++) { 
				 for(int j=0; j < LEN; j++){ 
					 if(rArr[i] == myArr[j]){
						 if(i == j)  {
							 str++;
							 continue;
						 }else
						 ball++;
						 
					 }
			 }
				 
		}
			 System.out.printf("S: %d/ B: %d/ O: %d\n", str, ball, LEN - str - ball);
			 if(str==LEN) { // S 3개
				 break;
			 }
		 }
		 System.out.println("End!");
	            
		
	}
}
