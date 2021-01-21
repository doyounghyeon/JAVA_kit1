package com.kita.first.Level2.Practice;

public class PTest {
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김땡땡", 20);
		
		// 이름, 나이 출력
		myP.setName("김냥냥");
		
		String myN = myP.getName();
		
		
		myP.setAge(22);
		int myA = myP.getAge();
		System.out.printf("이름 : %s, 나이 : %d\n", myN, myA);
		
		
		
	}
}
