
public class TToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());// -> 1234
		System.out.println(stb);// -> 1234

		Box box = new Box("Camera");
		System.out.println(box.toString());// --> Camera

		// 이것이 출력되는 원리???
		/*
		 println 에 인스턴스의 참조값이 전달되면,
		 	해당 참조값이 참조하는 인스턴스의 toString 메소드를
		 	호출 한다.
		 	
		 */
		System.out.println(box);// --> Camera //이것이 출력되는 이유??

	}

}



class Box {

	private String conts;

	Box(String cont) {
		this.conts = cont;

	}

	//public String toString() {
	//	return conts;
	//}
}