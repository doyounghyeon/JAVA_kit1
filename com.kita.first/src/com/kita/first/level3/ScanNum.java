package com.kita.first.level3;

import java.util.Scanner;

public class ScanNum {
	public String inputNumString() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("숫자만 입력하시오: ");
		String str = scan.next();
		return str;
	}

	public void printMsg(int num) {
		if(num == 0) {
			System.out.println("잘못 입력했습니다.");
		}else {
			System.out.println("입력한 숫자: "+ num);
		}
	}
}
