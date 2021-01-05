package com.kita.first.Practice;

public class Practice6 {
	public static void main(String[] args) {
		 // 주사위 굴리기 1~6
		
		int rNum = (int)(Math.random() * 6 + 1); //0 + 1 <= Num < 6 + 1  1 , 2 , 3, 4, 5, 6
		System.out.println(rNum);
		
		 ///0 + 1 <= Num < 6 + 1  1 , 2 , 3, 4, 5, 6
		
		// 10 ~ 30
		
		int rNum2 = (int)(Math.random() * 21) + 10;  // 0  + 10 <= num < 1 + 10 
		System.out.println(rNum2);
	
		//14 ~ 57
		
		int rNum3 = (int)(Math.random() * 44) + 14 ;   // 14 <= num < 57 
		System.out.println(rNum3);
	
	// int n = (int)(Math.random() * (max - min + 1)) +min;
		
		
		
	}
	
}
