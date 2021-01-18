package com.kita.first.Level2;

public class Magician extends Adventurer{
	int mp;
	
	Magician(int strength, int intellegence, int dexurity, int luck, int mp){
		super(strength, intellegence, dexurity, luck);
		this.mp = mp;
	}
	@Override   // 부모객체에 같은이름의 메소드가 있는지 확인해줌. 오버라이드할떄 항상쓰면 좋다. 이름이 다를시 오류가남
	void attack() {
		System.out.println("마법공격을 한다");
	}

	void teleport(){
		System.out.println("텔레포트를 한다.");
	}
	
	@Override
	void jump() {
		System.out.println("마법점프를 한다");
	}
}
