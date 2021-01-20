package com.kita.first.Level2.pack1;

public class Singleton {
	
	private static Singleton sg = null;
	
	
	private Singleton(){}
	
	
	public static Singleton getInstance() {
		if(sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}
