package c16.p05_make_parent;

public class FriendInheri_blindEx {

	public static void main(String[] args) {
		   Friend[] frns = new Friend[10];
		   int cnt = 0;
		   
		//   frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		//   frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		//   frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		//   frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");
	        frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
	        frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
	        frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
	        frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");
 
		   // 모든 동창 및 동료의 정보 전체 출력
		   for(int i = 0; i < cnt; i++) {
		      frns[i].showInfo();      // 오버라이딩 한 메소드가 호출된다.
		      System.out.println();
		   }
	}

}

class Friend{
	private String na;
	private String tel;
	Friend(String na,String tel){
		this.na = na;
		this.tel = tel;
	}
	void showInfo() {
		System.out.println("이름:"+ na);
		System.out.println("전화:"+ tel);
	}
}
class UnivFriend extends Friend{
	private String maj;
	UnivFriend(String na,String tel,String maj){
		super(na,tel);
		this.maj = maj;
	}
	void showInfo() {
		super.showInfo();
		System.out.println("전공:"+ maj);
	}
	
}
class CompFriend extends Friend{
	private String dep;
	CompFriend(String na,String tel,String dep){
		super(na,tel);
		this.dep = dep;
	}
	void showInfo() {
		super.showInfo();
		System.out.println("부서:"+ dep);
	}
	public String toString() {
	      return "My CompFriend";
	   }

}

