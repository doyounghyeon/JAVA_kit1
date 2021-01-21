package com.kita.first.Level2.pack1;

public /*final*/ class FinalStatic {
	final int N1;
	static final int N2 = 4;
	static int n3 = 1;
	
	FinalStatic(int n1, int n2) {
		this.N1 = n1;
		printNum(n1);
		n3 = n2;
		
	}
	
	static /*final*/ void printNum(int input) {  //메소드에 final을 붙이면 override불가능. static를 막사용하면 메모리를 잡아먹는다.
		System.out.println(input);
		//System.out.println(n3); // int n3에 static가 없으면 오류가남.
		call();  // 아래 메소드에서 static가 없으면 오류.
	}
	
	static void call() {
		System.out.println("안녕");
	}
	
	
}
