package t21;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		
        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
        myTV.show();
	}

}
class TV{
	private String company;
	private int year, inch;
	public TV(String company, int year, int inch) {
		super();
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
	public void show() {
		System.out.println(getCompany() +"에서 만든 " + getYear() + "년형 "+ getInch() +"인치 TV");
	}
}




/*
public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
        myTV.show();
}

//출력
LG에서 만든 2017년형 32인치 TV

*/