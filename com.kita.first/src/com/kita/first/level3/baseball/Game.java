package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Game {
// 실제로 게임을하는 클래스
	int gameCnt = 3;
	BaseBall ball = new BaseBall(gameCnt);
	MyBall myBall = new MyBall(gameCnt);
	
	
	do {
		myBall.setNumbers();
		}while(Checker.check(gameCnt, ball, myBall));
	
		System.out.println("야구게임 종료");
	}