package com.kita.first.Level2;

import com.kita.first.Level2.hyori.*;
import com.kita.first.Level2.mamamoo.*;

public class Test {
	public static void main(String[] args) {
//		Class1 c1 = new Class1();
//		com.kita.first.Level2.pack2.Class1 c1 = new com.kita.first.Level2.pack2.Class1();
		
	
//		Car car1 = new Car(30);
//		
//		
//		int car1Speed = car1.getSpeed();
//		System.out.println(car1Speed);
//		car1.setSpeed(40);
//	
//		System.out.println(car1Speed);
//		
//		
//		
//		
//		car1.setColor("보라색");
//		String car1Color = car1.getColor();
//		System.out.println(car1Color);
//		
//		car1.setColor("파란색");
	
//		String car1Color = car1.getColor(); getColor을 찍어주지 않으면 그전의 값이 그대로 나옴
//		System.out.println(car1Color);
//		System.out.println(car1.speed);

		IMac myIMac = new IMac(500,"스페이스 그레이");
		
		myIMac.setMemory(800);
		myIMac.setMemory(600);
		int myMemory = myIMac.getMemory();
		System.out.println(myMemory);
		
		
		
	}
}
