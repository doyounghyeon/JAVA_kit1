package com.kita.first.level4;

public class JavaAPI {
public static void main(String[] args) {
//	Parent p = new Parent();
//	
//	String str = "안녕";
//	StringBuffer sb = new StringBuffer("안녕"); //StringBuffer는 문자열 아님
//	boolean result = (sb.equals(str));  // 문자열이 아니라 false가 나옴
//	boolean result2 = (str.contentEquals(sb));
//	System.out.println(result);
//	System.out.println(result2);
//	
//	
//	System.out.println(p.toString());  // 주솟값 출력  toString()
//	
//	
//	str = "124";
//	Integer.parseInt(str);
//	str = "2.3";
//	Double.parseDouble(str);
//	Float.parseFloat(str);
//	
//	Math.random(); // 0 ~ 0.99999999999...
//	int max = 9;
//	int min = 1;
//	int num = (int)(Math.random() * (max - min +1)+ min);
//	
//	
//	String.valueOf(num);  // 숫자값을 문자열로 변환
	
	// https://docs.oracle.com/javase/8/docs/api/  api찾을수있다.
	
	char c = new Character('A');
	int num = new Integer("1000");
	double num2 = new Double("34.232");
	
	int num3 = new Integer("080327");
	System.out.println("num3: "+ num3); // 젤앞의 0이 사라진다.
	
	String ad = "080327 345678";
	Character c2 = ad.charAt(7);
	
	switch(c2) {
	case 1: case 3:
		System.out.println("남자 입니다.");
	case 2: case 4:
		System.out.println("여자 입니다.");
	}
	
	String str = "오늘은 날씨가 좋다.";
	Character v1 = str.charAt(4);
	System.out.println("v1: "+v1);
	
	int idx = str.indexOf("날씨가");
	System.out.println("idx: "+ idx);
	
	int len = str.length();
	System.out.println("len: "+ len);
	
	String str2 =  str.replace("날씨가", "기분이");   // 위의 str에서 "날씨가"를 "기분이"로 바꿈
	System.out.println("str2: "+ str2);
	
	String str3 = str.substring(4);
	System.out.println("str3: "+ str3);
	
	String str4 = str.substring(4, 7);
	System.out.println("str4: "+ str4);
	
	String str5 = "Hello I'm fine thank you and you?";
	String str6 = str5.toLowerCase(); // 안에있는 영어를 전부 소문자로 바꾼다.
	String str7 = str5.toUpperCase(); // 안에있는 영어를 전부 대문자로 바꾼다.
	System.out.println("str6: "+ str6);  
	System.out.println("str7: "+ str7);
	
	String str8 = "          안녕         ";
	String str9 = str8.trim();  //앞뒤로 있던 공백을 지운다.
	System.out.println("str9: "+ str9); 
	
	Math.random();
	double n1 = Math.abs(-3.4);  //절대값으로 변환
	System.out.println("n1: "+ n1);
	
	double n2 = Math.ceil(5.6); // 올림값
	System.out.println("n2: "+ n2);
	n2 = Math.ceil(-4.8);
	System.out.println("n2: "+ n2);
	
	double n3 = Math.floor(5.7); // 내림값
	System.out.println("n3: "+ n3);
	
	double n4 = Math.round(4.5); // 반올림 값
	System.out.println("n4: "+ n4);
}
}
