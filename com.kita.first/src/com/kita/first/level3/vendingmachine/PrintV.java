package com.kita.first.level3.vendingmachine;

public class PrintV {
	// 메뉴 이름과 가격 찍기
	void printMenu(Menu menu, int n){
		String item = menu.getMenuItem(n-1);
		int price = menu.getMenuPrice(n-1);
		System.out.printf("%d. %s %d원\n", n, item , price);
		
		// 이렇게도 가능
		// System.out.printf("%d. %s %d원\n", n, menu.getMenuItem(n-1), menu.getMenuPrice(n-1));
	}
	void printTotalPrice(Game game) {
		System.out.printf("합계: %d원\n", game.getTotalPrice());
	}

}
