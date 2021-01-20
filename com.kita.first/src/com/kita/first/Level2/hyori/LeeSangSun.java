package com.kita.first.Level2.hyori;

public class LeeSangSun {
	LeeSangSun(){
		super("");
	}
	
}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
//		hr.star = 1000;  패키지가 같아도 private는 이동 불가
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(1000); 패키지가 같아도 private는 이동 불가
		
		hr.sing();
		hr.drinkTea();
//		hr.dance();  패키지가 같아도 private는 이동 불가
}
