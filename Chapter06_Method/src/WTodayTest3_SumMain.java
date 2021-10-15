// 10.아래의 프로그램을 작성하시오.
// 1 부터 num 까지 합을 구하는 class 를 작성하도록 하시오.
class GetSum{
	int end;
	public void setNum(int num){
		end = num; 
	}
	//public int sum() {
	public void sum() {
		int sum=0;
		for(int i=0; i<=end; i++) {
			sum += i;
		}
		System.out.println("sum:"+ sum);
		//return sum;
	}
}

public class WTodayTest3_SumMain {
	
	public static void main(String[] args) {
        GetSum getsum = new GetSum(); //1)객체 생성
        int num; //2)num 변수 선언
        num = 50;
        //num = 100;

        getsum.setNum(num); //3)getsum 객체의 setNum함수 호출, num값 50 저장
        getsum.sum(); //4)getsum객체의 sum함수 호출, 1-50까지 합 구함
	}
}
