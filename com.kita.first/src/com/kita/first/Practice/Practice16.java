package com.kita.first.Practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		// 1 ~ 6 총 6개의 메뉴 랜덤 뽑기를 한번 한 후에 !
		// 뽑힌 메뉴 : ㅇㅇ
		// 마음에 들면 Y 눌러서 반복 끝내고
		// 오늘의 메뉴는 ㅇㅇ입니다
		// 마음에 안 들면 다시 랜덤 뽑기
		
		//do~while, if, scan 사용
		
		Scanner scan = new Scanner(System.in);
		String menu;
		do {
			// 메뉴 뽑기
			int rNum = (int)(Math.random() * 6 )+ 1; 
		
			if(rNum == 1) {
				menu = "중화요리";
			}else if (rNum == 2) {
				menu = "피자";
			}else if (rNum == 3) {
				menu = "치킨";
			}else if (rNum == 4) {
				menu = "족발";
			}else if (rNum == 5) {
				menu = "파스타";
			}else {
				menu = "햄버거";
		}
			System.out.println("뽑힌 메뉴 : " + menu);
			System.out.println("마음에 듭니까?(Y/N)");
			String result = scan.next();
			if("Y".equals(result)) {
				break;
			}
		}while(/* 마음에 드는지 안드는지*/true);
		scan.close();
		System.out.printf("오늘의 메뉴는 %s입니다.\n",menu);
			}
	}

