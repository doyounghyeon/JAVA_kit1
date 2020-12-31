package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		int rNum = (int)(Math.random() * 6 + 1); 
		String menu;
		switch(rNum) {
		case 1: 
			menu = "한식";
			break;
		case 2:
			menu = "양식";
			break;
		case 3:
			menu = "일식";
			break;
		default :
			menu = "치킨";
		}
		System.out.printf("오늘의 메뉴는 %s입니다.\n",menu);
		
		
		
	}
}
