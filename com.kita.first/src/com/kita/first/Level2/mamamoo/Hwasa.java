package com.kita.first.Level2.mamamoo;

import com.kita.first.Level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi{
	
	public Hwasa(){
		super("인스타");
		this.music = "";
		this.sns = "";
	//	this.star = 12;  private라서 불가
		
	
	}
	
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
//	    hr.sns = "인스타"; // 패키지가 다르면 디폴트도 접근불가
//		hr.star = 1000;  private라서 다른패키지 접근불가
		
//		eeHyoRi hr2 = new LeeHyoRi("인스타");  패키지가 다르면 디폴트도 접근불가
//		LeeHyoRi hr3 = new LeeHyoRi(1000);   private라서 다른패키지 접근불가
		
		hr.sing();
//		hr.drinkTea();   패키지가 다르면 디폴트도 접근불가
//		hr.dance();      private라서 다른패키지 접근불가
		
		
	}
}
