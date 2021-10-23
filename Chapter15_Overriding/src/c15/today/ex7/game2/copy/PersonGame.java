package c15.today.ex7.game2.copy;

import java.util.Scanner;

/*
 * -----문제 6-----
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

-----문제 7-----
문제 6의 갬블링 게임을 n명이 하도록 수정하라.
실행 예시와 같이 게임에 참여하는 선수의 수를 입력 받고 각 선수의 이름을 
입력 받도록 수정하라.

겜블링 게임에 참여할 선수 숫자>>3
1번째 선수 이름>>황
2번째 선수 이름>>이
3번째 선수 이름>>김
[황]:
2  3  3  아쉽군요!
[이]:
1  2  2  아쉽군요!
[김]:
2  2  3  아쉽군요!
[황]:
3  2  2  아쉽군요!
[이]:
1  1  3  아쉽군요!
[김]:
2  2  1  아쉽군요!
[황]:
2  2  2  황님이 이겼습니다!
 */
public class PersonGame {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("겜블링 게임에 참여할 선수 숫자>>");
		int pcnt = sc.nextInt();
		Person[] person = new Person[pcnt];
		
		for(int i=0; i<person.length; i++) {
			person[i] = new Person();
			System.out.print((i+1) + "번째 선수 이름>>");
			str = sc.next();
			person[i].setName(str);
		}
		
		// 주의 : ??왜 사용, 위에서 입력받은 스트링이 , 스트링 + \n 나눠서 , 2번 전달 되는건가?
		sc.nextLine();
		
		int i = 0;
		int k = 0;
		while(true) {
			k = i % person.length;
			i++;
			System.out.print("[" + person[k].getName() + "]:");
			
			// 주의 :  어떻게 기달렸다가 돌릴수 있을까?,  Enter키 만을 입력하면 넘어가게 할려면? 
			str=sc.nextLine();
			if(!str.equals(""))
				continue;
				
			if(person[k].startGame()) {
				sc.close();
				break;
			}

		}

	}

}


class Person{
	private String name;
	private int[] nary = new int[3]; 
	
//	Person(String name){
//		this.name = name;
//	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
	boolean game() {
		int cnt = 0;
		boolean win = false;
		for(int i=0; i<nary.length ; i++) {
			nary[i] = (int)(Math.random()*3 + 1);
			System.out.print(nary[i] + " ");
		}
		
		for(int i=0; i<nary.length-1 ; i++) {
			if(nary[i] == nary[i+1]) {
				cnt++;
			}
		}
		if(cnt == nary.length-1)
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