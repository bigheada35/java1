package r_today_test2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		HashMap<String, String > hm = new HashMap<>();
		while(true) {
			System.out.println("나라 이름, 인구 >> ");
			String national = sc.next();
			
			if(national.equals("그만")) {
				break;
			}
			
			String popula = sc.next();

			hm.put(national,popula);
		}
	
		Set<String> set = hm.keySet();
/*
		for(Iterator<String> it = set.iterator(); it.hasNext();  ) {
			String str = it.next();
			System.out.println(str + ", " + hm.get(str));
		}
*/		
		
		while(true) {

			System.out.println("인구 검색 >> ");
			String findNational = sc.next();
			
			if(findNational.equals("그만")) {
				break;
			}			
			boolean isFinded = false;
			for(Iterator<String> it = set.iterator(); it.hasNext(); ) {
				String str = it.next();
				if(str.equals(findNational)) {
					isFinded = true;
					System.out.println(findNational + "의 인구는 " + hm.get(str));
				}
			}
			if(isFinded == false) {
				System.out.println(findNational + " 나라는 없습니다." );
			}
		}
		
		
		
		System.out.println("종료");
		
		
	}

}




/*

"그만"이 입력될 때까지 나라 이름과 인구를 입력 받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 
다음 해시맵을 이용하라.
=================================================================================
나라 이름과 인구를 입력하세요.(예: Korea 5000)
나라 이름, 인구 >> Korea 5000
나라 이름, 인구 >> USA 1000000
나라 이름, 인구 >> Swiss 2000
나라 이름, 인구 >> France 3000
나라 이름, 인구 >> 그만

인구 검색 >> France
France의 인구는 3000
인구 검색 >> 스위스
스위스 나라는 없습니다.
인구 검색 >> 그만

*/