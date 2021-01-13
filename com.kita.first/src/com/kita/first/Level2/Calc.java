package com.kita.first.Level2;

public class Calc {
	
		// 필드
		
		// 생성자
	
		// 메소드
		public static void main(String[] args) {
			Calc myCalc = new Calc();
			
			myCalc.powerOn();
			int num = sum(2, 3);
			System.out.println(num);
			int num2 = myCalc.minus(2, 3);
			System.out.println(num2);
			int num3 = myCalc.multiply(3, 2);
			System.out.println(num3);
			double num4 = myCalc.divide(3, 2);
			System.out.println(num4);
			myCalc.powerOff();
		
		}
		public static void powerOn(/*매개변수*/){
			System.out.println("전원을 켭니다.");
		}
		
		public static int sum(int n1, int n2){
			int result = n1 + n2;
			return result;
		}
		 void powerOff() {
			System.out.println("전원을 끕니다.");
		
		}
		 int minus(int n1, int n2) {
				int result = n1 - n2;
				return result;
		}
		 int multiply(int n1, int n2) {
			int result = n1 * n2;
			return result;
	}
		 double divide(int n1, int n2) {
			double result = (n1 / n2);
			return result;
	}

}
