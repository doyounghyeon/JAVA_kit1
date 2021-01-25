package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
		String str = "12345";
		int num1 = Integer.parseInt(str); // 문자열을 숫자로 바꿈
		double num2 = Double.parseDouble(str);
//		try {
//			Integer.parseInt(str);
//		}catch(Exception e) {
//			e.printStackTrace();
//			Double.parseDouble(str);
//		}
		
		double n1 = 3.4;
		int n2 = (int)n1;
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3"); // 숫자덧셈 에다가 문자열이 붙음 -> 값: 33
		
		Animal ani = new Animal();
		Cat cat = new Cat();
		ani = cat;
		
		// try문에서 오류가나면 catch문을 실행
		try {
			Cat dog = (Cat)ani;
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("문제 발생");
		}finally { //finally는 써도되고 안써도됨.  try문에서 오류가 나던 안나던 실행이됨
			System.out.println("형변환 시도 종료");
		}
	}
}
