package com.kita.first.level4;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ListCollection {
	public static void main(String[] args) {
		List<String>  list = new ArrayList<String>();
		list.add("안녕");
		list.add("하세요");
		list.add(2,"저는");
		list.set(0, "하이");
		list.remove(2);
		
		
		List<Cd> sheif = new LinkedList<Cd>();
		
	}
}
