package com.kita.first.Level2;

public class GalaxyPhone extends Phone{
	
	String ai_secr;
	
	GalaxyPhone(String company, String name, String color, int memory, String ai_secr){
		super("삼성", name, color, memory);
		this.ai_secr = ai_secr;
	}
	
	void paySamsumgMoney() {
		System.out.println("삼성페이를 사용한다.");
	}
}
