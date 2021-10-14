package a;

public class A2 {
	public void A2CallA() {
		A a = new A();
		a.a = 1;
		//a.a2 = 2;//err, ap:private
		a.a3 = 3;
		a.printA();
		
		 
	}

}
