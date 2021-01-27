package com.kita.first.level3;

public abstract class Animal extends Object{
	// abstract를 사용하면 new클래스로 생성불가하고 상속만 가능하다.
	Animal(){
		super();
	}
	
	void crying() {
		System.out.println("동물이 운다.");
	}
}
