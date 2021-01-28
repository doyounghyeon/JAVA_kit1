package com.kita.first.Practice;


import java.util.Scanner;

public class Practice29 {


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
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			final int LEN = 3;
			int[] rArr = new int[LEN]; // {0, 0, 0}
			int[] myArr = new int[LEN];// {0, 0, 0}
			int strike;
			int ball;
			
			System.out.println("숫자 야구게임 시작!");
			// 컴퓨터가 뽑는 랜덤 숫자
			int max = 9;
			int min = 1;
			
			for(int i=0; i<LEN; i++) {
				rArr[i] = (int)(Math.random() * (max-min)+1)+min;
				for(int z=0; z<i; z++) {
					if(rArr[i] == rArr[z]) {
						i--;
						break;
					}
				}
			}
			for(int i=0; i<LEN; i++) {
				System.out.println(rArr[i]);
			}
			// rArr  {6, 5, 8}
			while(true) {
				strike = 0;
				ball = 0;
				
				// 값 입력 반복문
				for(int i=0; i<LEN; i++) {
					System.out.printf("값%d: ", i+1);
					myArr[i] = scan.nextInt();
					if(max <myArr[i] || min > myArr[i]) {
						System.out.println("범위 밖의 숫자입니다.");
						i--;
						continue;
					}
					for(int z=0; z<i; z++) {
						if(myArr[z]==myArr[i]) {
							System.out.println("중복된 숫자입니다.");
							i--;
							break;
						}
					}
				}
				
				// 값 비교 반복문
				for(int i=0; i<LEN; i++) {
					if(myArr[i]==rArr[i]) {
						strike++;
						continue;
					}
					for(int z=0; z<LEN; z++) {
						if(myArr[i]==rArr[z]) {
							ball++;
						}
					}
				}
				
				// 결과값 출력
				System.out.printf("s: %d / b: %d / o: %d\n", strike, ball, LEN-strike-ball);
				
				if(strike==LEN) {
					break;
				}
			}
			System.out.println("End!");
		}
	}