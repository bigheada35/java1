package A1.test;

public class smartphone_polymorphism {

	public static void main(String[] args) {
			/*----------*/System.out.println("=====phone====");
		   SmartPhone phone = 
			          new SmartPhone("010-555-777", "Nougat");
		   /*----------*/System.out.println("--phone--:" + phone + ", "+ System.identityHashCode(phone));
			phone.answer();   // 전화를 받는다.
			phone.playApp();   // 앱을 선택하고 실행한다.
			
			
			/*----------*/System.out.println("=====ph2====");   
		   MobilePhone  ph2 = new SmartPhone("010-555-777", "Nougat");
		   /*----------*/System.out.println("--ph2--:" + ph2 + ", "+ System.identityHashCode(ph2));
		   ph2.answer();
		   //ph2.playApp();
	}

}

class MobilePhone {
	   protected String number;     // 전화번호
	   
	   public MobilePhone(String num) {
	      number = num;
	      System.out.println("--11number--:" + System.identityHashCode(number));
	   }
	   public void answer() {
	      System.out.println("Hi~ from " + number);
	   }
	}


class SmartPhone extends MobilePhone {
	   private String androidVer;   // 안드로이드 운영체제 네임(버전)

	   public SmartPhone(String num, String ver) {
	      super(num);
	      androidVer = ver;
	      System.out.println("--22androidVer--:" + System.identityHashCode(androidVer));
	   }
	   public void playApp() {
	      System.out.println("App is running in " + androidVer);
	   }
	   //
	   //	overriding
	   //
	   @Override
	   public void answer() {
		      System.out.println("11111@Override@Override@Override " + number);
		   }
	}
