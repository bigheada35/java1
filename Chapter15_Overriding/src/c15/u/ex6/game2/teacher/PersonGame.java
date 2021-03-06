package c15.u.ex6.game2.teacher;

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
public class PersonGame {

	public static void main(String[] args) {

		Person[] person = new Person[2];
		Scanner sc = new Scanner(System.in);
		String str;
		
		for(int i=0; i<person.length; i++) {
			
			System.out.print((i+1) + "번째 선수 이름>>");
			str = sc.next();
			person[i] = new Person(str);
		}
		
		// 주의 : ??왜 사용, 위에서 입력받은 스트링이 , 스트링 + \n 나눠서 , 2번 전달 되는건가?
		
		sc.nextLine();// 주의 설명 :  위의 next() 을 사용한 뒤에, 버퍼에 '\n'등이 남아 있다. 이것을 없애기 위해서 사용
		
		int i = 0;
		while(true) {
			System.out.print("[" + person[i].getName() + "]:");
			
			// 주의 :  어떻게 기달렸다가 돌릴수 있을까?,  Enter키 만을 입력하면 넘어가게 할려면? 
			str=sc.nextLine();
			if(!str.equals(""))
				continue;
				
			if(person[i].startGame()) {
				sc.close();
				break;
			}
			i = i  ^ 1;
		}

	}

}


class Person{
	private String name;
	
	//private int[] nary = new int[3]; 
	private int num1;
	private int num2;
	private int num3;
	
	Person(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	boolean game() {

		boolean win = false;
		
		num1 = (int)(Math.random()*3 + 1);
		num2 = (int)(Math.random()*3 + 1);
		num3 = (int)(Math.random()*3 + 1);
		
		System.out.println(num1 +" " + num2 + " " + num3);
		
		if(num1 == num2 && num2 == num3)
			win = true;
		return win;
	}
	
	boolean startGame() {
		
		if(	game()) {
			System.out.println(getName() + "님이 이겼습니다!");
			return true;
		}else {
			System.out.println("  아쉽군요!");
			return false;
		}

	}
}