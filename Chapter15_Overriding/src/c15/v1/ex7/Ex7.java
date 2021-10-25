package c15.v1.ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int pcnt = sc.nextInt();
		Person[] p = new Person[pcnt];
		for(int i=0; i<pcnt; i++) {
			System.out.print( (i+1)+"번째 선수 이름>>");
			String pname = sc.next();
			p[i] = new Person(pname);
		}
		
		sc.nextLine();
		int k=0;
		while(true) {
			int i = k%pcnt;
			k++;
			System.out.print("[" + p[i].getName() + "]");
			sc.nextLine();
			if(p[i].game()) {
				System.out.println(p[i].getName() +"님이 이겼습니다!");
				return;
			}
			System.out.println("아쉽군요!");
		}
		
	}
}

class Person{
	private String name;
	private int[] num = new int[3];
	Person(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	boolean game() {
		boolean win = false;
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 3 + 1);
		}
		for (int j : num) {
			System.out.print(j+" ");
		}
		
		
		if(num[0] == num[1] && num[1] == num[2])
			win = true;

		return win;
	}
	
}

