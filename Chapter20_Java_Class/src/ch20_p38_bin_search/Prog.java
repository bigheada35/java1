package ch20_p38_bin_search;
import java.util.Arrays; //<-- ***

//배열의 탐색: 기본 자료형 값 대상의 예

public class Prog {
	public static void main(String[] args) {
	      int[] ar = {33, 55, 11, 44, 22};
	      
	      Arrays.sort(ar);   // 탐색 이전에 정렬이 선행되어야 한다. <-- *** 
	      
	      for(int n : ar)
	         System.out.print(n + "\t");
	      System.out.println();

	      //binarySearch는 이진 탐색을 진행! 
	      //그리고 이진 탐색을 위해서는 탐색 이전에 데이터들이 오름차순으로 정렬되어 있어야 한다. 

	      
	      //배열 a에서 key를 찾아서 있으면 key의 인덱스 값, 없으면 0보다 작은 수 반환	
	      int idx = Arrays.binarySearch(ar, 33); // 배열 ar에서 33을 찾아라.
	      System.out.println("Index of 33: " + idx);


/*

*/
	}
}

