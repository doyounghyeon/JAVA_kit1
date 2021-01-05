package com.kita.first.Practice;

public class Practice7 {
	public static void main(String[] args) {
		// 1 ~ 6 총 6개의 메뉴 랜덤 뽑기
		
		int rNum = (int)(Math.random() * 6 + 1); 
		System.out.println(rNum);
		String menu;
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
		System.out.printf("오늘의 메뉴는 %s입니다.\n",menu);
		
		
	}

}
