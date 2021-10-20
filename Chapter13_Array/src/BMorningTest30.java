/*
로또 번호6개를 출력 -중복없이
 */

public class BMorningTest30 {
	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.show();
	}
}

class Lotto{
	private int[] n = new int[6];
	Lotto(){
		for(int i=0; i<n.length; i++) {
			n[i] = gen();
			for(int j=0 ; j<i ; j++) {
				if(n[j] == n[i]) {
					i--;
				}
			}
		}
	}
	private int gen() {
		double r = java.lang.Math.random();
		int rand = (int)(r * 45 + 1);
		return rand;
	}
	void show() {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
	
}


