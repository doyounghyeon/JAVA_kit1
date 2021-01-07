package com.kita.first.Practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		// 컴퓨터가 뽑은 랜덤 수 (10~90)
		// Up&Down
		// Great!

		Scanner scan = new Scanner(System.in);
		int answer = (int)(Math.random() * 81)+10;
		
//		int max = 90;
//		int min = 10;
//		int answer = (int)(Math.random() * (max-min+1))+min;
		
		while(true) {
			System.out.print("숫자를 입력해주세요: (10~90)");
			int input = scan.nextInt();
			
			if(answer > input) {
				System.out.print("Up");
			}else if (answer < input) {
				System.out.print("Down");
			}else {
				System.out.print("Great!");
				break;
				}
			}
		scan.close();
		}
	}

