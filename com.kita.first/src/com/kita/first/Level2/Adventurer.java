package com.kita.first.Level2;

public class Adventurer {
	int strength;
	int intellegence;
	int dexterity;
	int luck;
	
	Adventurer(int strength, int intellegence, int dexurity, int luck){
		this.strength = strength;
		this.intellegence = intellegence;
		this.dexterity = dexterity;
		this.luck = luck;
	}
	
	void attack() {
		System.out.println("일반공격을 한다.");
	}
	void jump() {
		System.out.println("점프를 한다.");
	}
	
}
