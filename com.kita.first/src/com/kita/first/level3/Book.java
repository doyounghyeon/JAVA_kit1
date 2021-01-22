package com.kita.first.level3;

public class Book {
	//생성자는 클래스와 이름이같다.  리턴타입x
	//메소드는 리턴타입o
	public int chapter;
	public int maxChapter;
	
	public Book(int maxChapter) {
		this.maxChapter = maxChapter;
	}
	
	boolean read() {
		++chapter;
		if(chapter < maxChapter) {
			System.out.println("책을 읽는다");
			return true;
		}else {
			System.out.println("책을 이미 다 읽었다.");
			return false;
		}
	}
	
	
}
