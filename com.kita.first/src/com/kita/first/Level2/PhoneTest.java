package com.kita.first.Level2;

public class PhoneTest {
public static void main(String[] args) {
	
	GalaxyPhone sNote20 = new GalaxyPhone("삼성","S노트20","파란색", 300,"갤럭시");
	System.out.println(sNote20.ai_secr);
	sNote20.sendMsg("안녕");
	
	System.out.println(sNote20.company);
	System.out.println(sNote20.name);
	System.out.println(sNote20.color);
	System.out.println(sNote20.memory);
	
//	Phone myPhone = new Phone("Iphone 12 Pro Max", "Gold", 256);
//	System.out.println(myPhone.name);
//	System.out.println(myPhone.color);
//	System.out.println(myPhone.memory + "G");
//	System.out.println();
//	Phone yourPhone = new Phone("Iphone 12 Pro", "Silver", 128);
//	System.out.println(yourPhone.name);
//	System.out.println(yourPhone.color);
//	System.out.println(yourPhone.memory + "G");
//	
//	System.out.println();
//	
//	Phone phone1 = new Phone();
//	System.out.println(phone1.name);
//	System.out.println();
//	
//	Phone phone2 = new Phone("Iphone se2");
//	System.out.println(phone2.name);
//	System.out.println(phone2.color);
//	System.out.println(phone2.memory);
//	
}
}
