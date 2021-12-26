package t21;

import java.util.Scanner;

public class t21 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
class TV{
	private String brand;
	private int year, inch;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public TV(String brand, int year, int inch) {
		super();
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println( getBrand()+ "에서 만든 " + getYear()+ "년형 " +  getInch() + "인치 TV");
		
		
	}
}
/*
아래의 TV 클래스를 만드시오.

public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
        myTV.show();
}

//출력
LG에서 만든 2017년형 32인치 TV
*/



