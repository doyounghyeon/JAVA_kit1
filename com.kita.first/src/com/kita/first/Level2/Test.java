package com.kita.first.Level2;

import com.kita.first.Level2.hyori.*;
import com.kita.first.Level2.mamamoo.*;

public class Test {
	public static void main(String[] args) {
//		Class1 c1 = new Class1();
//		com.kita.first.Level2.pack2.Class1 c1 = new com.kita.first.Level2.pack2.Class1();
		
	
		Car car1 = new Car(30);
		
		int car1Speed = car1.getSpeed();
		System.out.println(car1Speed);
		
		car1.setColor("보라색");
		String car1Color = car1.getColor();
		
		System.out.println(car1Color);
//		System.out.println(car1.speed);
		
		
	}
}
