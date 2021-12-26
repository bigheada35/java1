package temp_03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class TV{
	private String manufact;
	private int year, inch;
	TV(String manufact, int year, int inch){
		this.manufact = manufact;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(manufact + "에서 만든 "+ year +"년 " + inch + "인치");
	}
}
public class Test3 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
        myTV.show();
	}

}
 
