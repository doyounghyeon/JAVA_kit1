package com.kita.first.Level2.Practice;

public class Practice01 {
	public static void main(String[] args) {
		printGugudan(2);
		Practice01 pr = new Practice01();
		pr.printGugudan2(2);
		
		for(int i=2;i<10;i++) {
			pr.printGugudan2(i);
		}
	}
	
	static void printGugudan(int num){
		// 구구단 출력
		for(int i = 1; i <= 0 ;i++) {
			System.out.printf("%d * %d =%d\n", num, i, (num * i));
		}
	}
	
	void printGugudan2(int num) {
		for(int i = 1; i < 10 ;i++) {
			System.out.printf("%d * %d =%d\n", num, i, (num * i));
		}
	}
	
	
}

