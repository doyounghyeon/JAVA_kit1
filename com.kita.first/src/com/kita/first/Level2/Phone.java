package com.kita.first.Level2;

public class Phone /*모든 상위 클래스는 extends Object 가 생략되어 있다.*/ {
	
//	Object는 모든클래스를 상속한다. (최상위 객체)
	
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
	Phone() {
		//super(); 가 생략되어있다.
	}
	
	Phone(String company){
		this(company, "휴대폰", "Gold", 256);
	}
	
	Phone(String company, String name, String color){
		this(company, name, color, 256);  // 같은걸 개수가 달라지게 내려가는것 : 오버로딩
		
	}
	
	Phone(String company,String name, String color, int memory){ 
		this.company = company;						// 필드를 초기화
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


