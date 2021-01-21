package com.kita.first.Level2.hyori;

public class LeeHyoRi {
	// 필드
	public String music;  //접근제한 없음
	protected String sns; // 동일패키지 내부에서 사용가능, 예외로 다른패키지에서 이클래스를 상속받으면 사용가능  
	private int star;	// 클래스 내부에서만 가능
	// 생성자
	public LeeHyoRi() {}
	protected LeeHyoRi(String sns){
		this.sns = sns;
	}
	private LeeHyoRi(int star){
		this.star = star;
	}
	// 메소드
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
		hr.star = 1000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
		LeeHyoRi hr3 = new LeeHyoRi(1000);
		
		hr.sing();
		hr.drinkTea();
		hr.dance();
	}
	
	public void sing() {}
	void drinkTea() {}
	private void dance() {}
}
