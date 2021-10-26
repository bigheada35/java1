package c16.p05;

public class FriendInheriTest {

	public static void main(String[] args) {
		   Friend[] frns = new Friend[10];
		   int cnt = 0;
		   
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


//final class Friend {
class Friend {
	   protected String name;
	   protected String phone;
	   
	   public Friend(String na, String ph) {
	      name = na;
	      phone = ph;
	   }
	   //final public void showInfo() {
	   public void showInfo() {
	      System.out.println("이름: " + name);
	      System.out.println("전화: " + phone);
	   }
	}

class UnivFriend extends Friend {
	   private String major;

	   public UnivFriend(String na, String ma, String ph) {
	      super(na, ph);
	      major = ma;
	   }
	   public void showInfo() {
		   // 주의 :  상속 받았으니깐 부모것 showInfo 사용하자
	      super.showInfo();
	      System.out.println("전공: " + major);
	   }
	}

class CompFriend extends Friend {
	   private String department;

	   public CompFriend(String na, String de, String ph) {
	      super(na, ph);
	      department = de;
	   }
	   public void showInfo() {
		  // 주의 :  상속 받았으니깐 부모것 showInfo 사용하자
	      super.showInfo();
	      System.out.println("부서: " + department);
	   }
	}
