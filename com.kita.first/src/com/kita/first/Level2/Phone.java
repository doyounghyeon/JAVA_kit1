package com.kita.first.Level2;

public class Phone {
	// 필드
	String company = "Apple";
	String name;
	String color;
	int memory;
	
	//  '생성자'
	
	/*
	  클래스명(){
		실행식
	}*/
	Phone() {}
	
	Phone(String name){
		this(name, "Gold", 256);
	}
	
	Phone(String name, String color){
		this(name, color, 256);
		
	}
	
	Phone(String name, String color, int memory){ 
								// 필드를 초기화
		this.name = name;
		this.color = color;
		this.memory = memory;
		
	}
	
	
	// 메소드
	
	/*(리턴타입 or void) 메소드명(매개변수 선언){
	실행식
	return 리턴타입 변수
	}*/

	String sendMsg(String str) {
		String result = str;
		String blank = "";
		if("".equals(str)) {
			result = blank;
		}
		System.out.println(result);
		return result;
	}
	void call() {
		
	}
}


