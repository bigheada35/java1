
public class TestSwitch {

	//private static int key;
		
		
	public static void main(String[] args) {
		
		Week today = Week.SUN;
		System.out.println("today:" + today);
		System.out.println(today);
		
		int n = 3;
		// TODO Auto-generated method stub
		switch (n) {
		case 1: {
			System.out.println("Simple Java");
			break;
		}
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
			
		default:
			//throw new IllegalArgumentException("Unexpected value: " + key);
			System.out.println("The best programming language");
		}
		System.out.println("Do you like Java?");
	}

}
