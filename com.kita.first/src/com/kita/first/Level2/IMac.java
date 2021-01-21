package com.kita.first.Level2;

public class IMac {
	private int memory;
	private String color;
	
	public IMac(int memory, String color) {
		this.memory = memory;
		this.color = color;
		
	}
	
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public String getcolor() {
		return color;
	}

}
