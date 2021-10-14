//import a.A;
import a.A2;

public class AccessTest {

	public static void main(String[] args) {
		//a.A a = new A(); //err, A:default
		//a.a = 10;
		
		A2 a2 = new A2();//ok, A2:public
		a2.A2CallA();
		
	}

}
