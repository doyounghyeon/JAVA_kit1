package com.kita.first.Level2.Practice;

public class Practice02 {
	public static void main(String[] args) {
		Practice02 pr = new Practice02();
		int n1 = pr.sum(5, 6);
		System.out.println(n1);
		int n2 = pr.minus(4, 7);
		System.out.println(n2);
		int n3 = pr.multiply(n1, n2);
		System.out.println(n3);
		double n4 = pr.divide(5, 3);
		System.out.println(n4);
		
		int n5 = pr.sum(5, 6, 7);
		System.out.println(n5);
		}
	
	int sum (int n1, int  n2) {
		int result = n1 + n2;
		return result;
	}
	int sum (int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	int minus (int n1, int  n2) {
		int result = n1 - n2;
		return result;
	}
	int multiply (int n1, int  n2) {
		int result = n1 * n2;
		return result;
	}
	 double divide (int n1, int  n2) {
		double result = ((double)n1 / n2);
		return result;
	}
}
