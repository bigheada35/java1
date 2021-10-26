package c16.p03;

public class Friend {

	public static void main(String[] args) {
		   UnivFriend[] ufrns = new UnivFriend[5];
		   int ucnt = 0;

		   CompFriend[] cfrns = new CompFriend[5];
		   int ccnt = 0;

		   ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		   ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

		   cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		   cfrns[ccnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

		   for(int i = 0; i < ucnt; i++) {
		      ufrns[i].showInfo();
		      System.out.println();
		   }

		   for(int i = 0; i < ccnt; i++) {
		      cfrns[i].showInfo();
		      System.out.println();
		   }

	}

}


class UnivFriend {     // 대학 동창
	   private String name;
	   private String major;    // 전공
	   private String phone;

	   public UnivFriend
	        (String na, String ma, String ph) {
	      name = na;
	      major = ma;
	      phone = ph;
	   }
	   public void showInfo() {
	      //System.out.println("이름: " + name);
	      //System.out.println("전공: " + major);
	      System.out.println("전화: " + phone);
	   }
	}
class CompFriend {     // 직장 동료
	   private String name;
	   private String department;     // 부서
	   private String phone;

	   public CompFriend
	        (String na, String de, String ph) {
	      name = na;
	      department = de;
	      phone = ph;
	   }
	   public void showInfo() {
		   
	      System.out.println("이름: " + name);
	      System.out.println("부서: " + department);
	      System.out.println("전화: " + phone);
	   }
	}
