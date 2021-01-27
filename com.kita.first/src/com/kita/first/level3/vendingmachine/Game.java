package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	private int count = 0;
	private int totalPrice=0;
	
	public int getCount() {
		return count;
		}
	 
	 public int getTotalPrice() {
			return totalPrice;
		}
	 
	 public void setCount() {
		 
	 }
	 
	 public void setTotalPrice() {
		 
	 }
	
	
	
	Scanner scan = new Scanner(System.in);
	// 번호 입력 받기
	int inputNum() {
		System.out.println("메뉴를 입력하세요(0 입력 시 종료): ");
		return scan.nextInt();
	}
	// 입력받은 번호 분기 가르기
	void divideNum(int num, int len) {
		if(num<1||num>len) {
			System.out.println("범위 내의 숫자를 입력해주세요");
		}else if(num == 0) {
			isContinue(num);
		}
	}
	
	boolean isContinue(int num) {
		if(num == 0) {
			return false;
		}
		return true;
	}
	// 메뉴 가격 합산
	void sumMenuPrice(Menu menu, int num) {
		totalPrice += menu.getMenuPrice(num);
	}
	
	// 입력받은 번호의 음료내용 프린트
	void printMenu(Menu menu, int num) {
		
	}
}
