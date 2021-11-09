package d_today_test6_teacher;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Test6 {
	public static void main(String[] args) {
		NickNameGame game = new NickNameGame();
		game.getNickName();
		game.getMaxName();
	}
}
class NickNameGame{
	//주의 : 의도  메인에서 혹시 사용할수 있으니깐, public
	public static final int COUNT = 5;
	ArrayList<String> nickName;
	
	public NickNameGame() {
		nickName = new ArrayList<>();
	}
	
	public int getMaxName() {
		int index = 0;
		int max = 0;
		
		String name = null;
		
		for (String str : nickName) {
			if( max <= str.length() ) {
				max = str.length();
				name = str;
				
			}
		}
		System.out.println("가장긴 별명 : " + name);
		return index;
	}
	
	public ArrayList<String> getNickName() {
		Scanner sc = new Scanner(System.in);
		for(int i=1 ; i<= COUNT ; i++) {
			System.out.println(i + "번째 사람의 별명을 입력하시오.");
			String name = sc.next();

			// 중요 : (단, 각 별명의 길이는 모두 다르게 입력한다.) 처리 부분 추가 ~!!!
			// 문제의 포인트.
			if(i>1) {
				for( int j=0; j < i-1; j++) {
					if(nickName.get(j).length() == name.length()) {
						System.out.println("별명의 길이는 같을수 없습니다. 다시 입력하세요.");
						i--;
						continue;
					}
				}
				
			}
			
			nickName.add(name);
		}
		return nickName;
	}
}

/*
6. 5명의 별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가
제일 긴 별명을 출력하시오. (단, 각 별명의 길이는 모두 다르게 입력한다.)
*/