package d_today_test6;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Test6 {
	public static void main(String[] args) {
		NickName nn = new NickName();
		nn.input();
		nn.findLongName();
	}
}
class NickName{
	private final int CNT = 5;
			// 주의:  listName 이런형태가 더 좋아 보임
	private List<String> name;
	NickName(){
		name = new ArrayList<String>();
	}
	void input(){
		try {
			Scanner sc= new Scanner(System.in);
			for(int i=0; i<CNT; i++) {
				System.out.print("별명을 입력하세요>>");
				String in = sc.next();
				
				System.out.println(in);
				// 주의  : 문제에서 	(단, 각 별명의 길이는 모두 다르게 입력한다.)
				//을 언급한, 처리 내용 들어 가야 함.
				name.add(in);
			}
		} catch (Exception e) {
			System.out.println("잘못된입력입니다.");
			input();
		}

	}
	void findLongName() {
		int max = 0;
		String longName = null;
		for (String string : name) {
			if(max <= string.length()) {
				max = string.length();
				longName = string;
			}
			//System.out.println(string + ":" + string.length());
		}
		System.out.println("긴 별명 : " + longName);
	}
}

/*
6. 5명의 별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가
제일 긴 별명을 출력하시오. (단, 각 별명의 길이는 모두 다르게 입력한다.)
*/