package com.kita.first.Practice;

public class Practice14 {
	public static void main(String[] args) {
		// 구구단 가로로 정렬
		for(int i = 1; i < 10; i++) {	
			
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %2d\t",j ,i , (i * j));
				
			}
			System.out.println();
			
		}
	}
}
