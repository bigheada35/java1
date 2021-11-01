package ch20_p26;
import java.util.Arrays;//<-- ***

//두 배열의 내용 비교
public class Prog {
	public static void main(String[] args) {
		int[] ar1 = {1, 2, 3, 4, 5};
		int[] ar2 = Arrays.copyOf(ar1, ar1.length);
		System.out.println(Arrays.equals(ar1, ar2));

		/*
		true
		*/
	   
	}
}
