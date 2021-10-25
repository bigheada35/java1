package c15.u.ex6.game2.teacher2;

import java.util.Scanner;

/*
 두 사람이 게임을 진행한다. 
이들의 이름을 키보드로 입력 받으며 
각 사람은 Person 클래스로 작성하라. 
그러므로 프로그램에는 2개의 Person 객체가 생성되어야 한다.

 두 사람은 번갈아 가면서 게임을 진행하는데 
각 사람이 자기 차례에서 <Enter> 키를 입력하면, 
3개의 난수가 발생되고 이 숫자가 모두 같으면 승자가 되고 
게임이 끝난다.
 난수의 범위를 너무 크게 잡으면 3개의 숫자가 
일치하게 나올 가능성이 적기 때문에 숫자의 범위는 
1~3까지로 한다.

 */
import java.util.Scanner;

class Person {
	private String name;
	private int num1, num2, num3;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}

	
	public boolean game() {

		num1 = (int) (Math.random() * 3 + 1);
		num2 = (int) (Math.random() * 3 + 1);
		num3 = (int) (Math.random() * 3 + 1);
	
		System.out.println(num1 +" " + num2 +" " + num3 +" ");
	
		if (num1 == num2 && num2 == num3) {
			return true;
		}

		return false;

	}

}

public class GablingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Person p1 = new Person(name);		
		
		System.out.print("2번째 선수 이름>>");
		name = sc.next();
		Person p2 = new Person(name);
		
		String buffer = sc.nextLine();
		
		while(true) {
			System.out.print("["+p1.getName()+"]:");
			//엔터를 받아 내기 위한 입력
			buffer = sc.nextLine();
		
			if(p1.game()) {
				System.out.println("["+p1.getName()+"]:" + "님이 이겼습니다.");
				break;
			}
			System.out.println("아쉽군요");
			//================================
			System.out.print("["+p2.getName()+"]:");
			//엔터를 받아 내기 위한 입력
			buffer = sc.nextLine();
		
			if(p1.game()) {
				System.out.println("["+p2.getName()+"]:" + "님이 이겼습니다.");
				break;
			}
			System.out.println("아쉽군요");
			
		}
		

	}

}
