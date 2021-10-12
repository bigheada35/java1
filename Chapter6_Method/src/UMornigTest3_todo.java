
public class UMornigTest3_todo {

	public static void main(String[] args) {
/*
  ------------- SSJ Test2 -------
 파라메터 값에 의해서,
 높이가 바뀌는 
 삼각 별을 찍는
 
 함수를 만드시오.	

	starPrint3(5) 

출력: 

  파라메터 : 5일때
    *			--------0   
   ***			--------1
  *****			--------2		
 *******		--------3
*********		--------4

  파라메터 : 7일때
      *			--------0   
     ***		--------1
    *****		--------2		
   *******		--------3
  *********		--------4
 ***********	--------5
*************	--------6


 */
	
		/*
		starPrint3(3);
		//System.out.println("-----");
		starPrint3(5);
		//System.out.println("-----");
		starPrint3(6);
		//System.out.println("-----");
		starPrint3(8);
		//System.out.println("-----");
		 */
		for(int i=3; i<10; i++) {
			starPrint3(i);
		}
	}
	
	public static void starPrint3(int layer) {
		int col_max = (layer -1)*2 + 1;
		int col_center = col_max/2; 
		for(int i=0; i<layer; i++) {
			for(int j=0; j<col_max; j++) {
				if(j>=(col_center-i) && j<=(col_center+i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	







	
}
