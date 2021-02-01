package com.kita.first.level4;

public class JavaAPI {
public static void main(String[] args) {
	Parent p = new Parent();
	
	String str = "안녕";
	StringBuffer sb = new StringBuffer("안녕"); //StringBuffer는 문자열 아님
	boolean result = (sb.equals(str));  // 문자열이 아니라 false가 나옴
	boolean result2 = (str.contentEquals(sb));
	System.out.println(result);
	System.out.println(result2);
	
	
	System.out.println(p.toString());  // 주솟값 출력  toString()
	
	
	str = "124";
	Integer.parseInt(str);
	str = "2.3";
	Double.parseDouble(str);
	Float.parseFloat(str);
	
	Math.random(); // 0 ~ 0.99999999999...
	int max = 9;
	int min = 1;
	int num = (int)(Math.random() * (max - min +1)+ min);
	
	
	String.valueOf(num);  // 숫자값을 문자열로 변환
	
	
	
}
}
