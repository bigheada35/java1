package com.kosmo.today.test;
//
// 주의 : println()에서 사용할려면 public 달아야 함
//
public class Box{
	private int num;
	private String name;
	
	public Box(int num, String name){
		this.num = num;
		this.name = name;
	}
	//
	// 주의 : println()에서 사용할려면 public 달아야 함
	//
	public String toString(){
		return name;
	}
	public int getBoxNum() {
		return num;
	}
}
