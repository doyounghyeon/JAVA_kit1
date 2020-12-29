package com.kita.first.practice;

public class practice2 {
	public static void main(String[] arg) {
		/*
		 * name  도영현	
		 * age	 22	
		 * vision 
		 * bloodType
		 * 
		 *  제이름은 ㅇㅇㅇ이고 나이는 ㅇㅇ살입니다.
		 *  시력은 ㅇ.ㅇ이고 혈액형은 ㅇ형입니다
		 * */
		
		String name = "도영현";
		int age = 22;
		double vision = 0.5;
		char bloodType = 'A';
		
		
		System.out.println("제 이름은 " + name +"이고 " + "나이는 " + age + "살입니다." );
		System.out.println("시력은 " + vision + "이고 " + "혈액형은 " + bloodType + "형입니다.\n");
		
		System.out.printf("제 이름은 %s이고 나이는 %d살입니다.\n시력은 %.1f이고 혈액형은 %c형입니다.\n",name, age, vision, bloodType);
	}
}
