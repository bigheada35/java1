package g_today_test1;
import java.util.Arrays;
public class Prog {
	public static void main(String[] args) {
		  INum[] ar1 = new INum[3];
		  INum[] ar2 = new INum[3];

		  ar1[0] = new INum(1); ar2[0] = new INum(1);
		  ar1[1] = new INum(2); ar2[1] = new INum(2);
		  ar1[2] = new INum(3); ar2[2] = new INum(3);

		  System.out.println(Arrays.equals(ar1, ar2));
	}
}
class INum{
	private int num;
	INum(int num){
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		INum inum = (INum)obj;
		if(this.num == inum.num)
			return true;
		else
			return false;
	}
}
/*
 결과: 
 	true
 */

/*
1. 아래의 결과 값은 false 출력이 된다. true 가 되도록 INum을짜시오.

  INum[] ar1 = new INum[3];
  INum[] ar2 = new INum[3];

  ar1[0] = new INum(1); ar2[0] = new INum(1);
  ar1[1] = new INum(2); ar2[1] = new INum(2);
  ar1[2] = new INum(3); ar2[2] = new INum(3);

  System.out.println(Arrays.equals(ar1, ar2));
 */

