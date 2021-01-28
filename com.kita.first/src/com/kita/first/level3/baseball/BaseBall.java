package com.kita.first.level3.baseball;

import java.util.Scanner;

public class BaseBall {
// 랜덤으로 숫자뽑는 클래스
	// 필드
	private int[] rArr;
	
	// 생성자
	public BaseBall(int gameCnt) {
		init(gameCnt);
	}
	
	
	
	private void  init(int gameCnt){
		rArr = new int[gameCnt];
	}
	
	// 메소드
	public int getRNum(int idx) {
		return rArr[idx];
	}
	
	private void setRandom(){
		int max = 9;
		int min = 1;
		for(int i = 0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random()*(max - min +1)+ min);
			for(int j = 0; j < i; j++) {
				if(rArr[j] == rArr[i]) {
					i--;
					break;
				}
			}
		}
	}
	
}

