package com.kita.first;

public class Printf {
	public static void main (String[] arg) {
		//System.out.print("안녕하세요.\n");
		//System.out.println("안녕하세요.");
		
		
		int age = 10;
		String name = "김땡땡";
		
		// 김땡땡은 10살이다.
		System.out.println("김땡떙은 10살이다.");
		System.out.println(name + "은 " + age + "살이다.");
		
		System.out.printf("%s은 %d살이다.\n", name, age);
		
		/*
		 * 올해로 20살이 된 김땡땡은
		 * 알바를 시작하여 매달 123만원을 받게 되었다.
		 * 김땡떙은 월급의 50%인 615000원을 떼어
		 * A 저축은행의 연이자율 2.33%짜리 적금에 넣기로 결심했다.
		*/
		
		int age1 = 20;
		String name1 = "김땡땡";
		int salary = 1_230_000;
		int percent = 50;
		int savings  = 615000;
		char bank = 'A';
		double rateOfInterest = 2.33333333333333;
		
		System.out.printf("올해로 %d살이 된 %s은\n알바를 시작하여 매달 %,d원을 받게 되었다.\n", age1, name1, salary);
		System.out.printf("%s은 월급의 %d%%인 %d원을 떼어\n%s 저축은행의 연이자율 %.2f%%짜리 적금에 넣기로 결심했다\n"
						  , name1, percent, savings, bank, rateOfInterest );
	}
}
