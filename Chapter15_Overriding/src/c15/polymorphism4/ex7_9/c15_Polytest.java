
package c15.polymorphism4.ex7_9;

/*
 [7-19] 다음은 물건을 구입하는 사람을 정의한 클래스이다 이 클래스는 멤버변수 Buyer .
로 돈 과 장바구니 를 가지고 있다 제품을 구입하는 기능의 메서드와 장 (money) (cart) . buy
바구니에 구입한 물건을 추가하는 메서드 구입한 물건의 목록과 사용금액 그리고 남 add , ,
은 금액을 출력하는 메서드를 완성하시오 summary . 
 
실행결과
	잔액이 부족하여 을 를 살수 없습니다 Computer / .
	구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
	사용한 금액:850
	남은 금액:150
 
 */
public class c15_Polytest {

	public static void main(String args[]) {
		Buyer b = new Buyer();
		System.out.println("-1-");
		b.buy(new Tv());
		System.out.println("-1-");
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		}

}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 
	
	//
	//  polymorphism 적용 되는 부분
	//   ex.  Product p = new Tv()
	//  
	void buy(Product p) {
		/*
		(1) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		1.3 .(add )
		 */
		if(money < p.price) {
			System.out.print("잔액부족하여: ");
			System.out.print(p);
			System.out.println("을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		/*
		(2) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 i의 값이 장바구니의 크기보다 같거나 크면
		1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
		1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
		1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
		1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
		*/
		//System.out.println("-3-");
		if(i >= cart.length) {
			Product[] cart2 = new Product[6];
			for(int j=0; j<cart.length; j++) {
				cart2[j] = cart[j];
			}
			cart = cart2;
		}
		//System.out.println("--2--");
		cart[i++] = p;

	} // add(Product p)
	void summary() {
		/*
		(3) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
		1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
		1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		*/
		int tot=0;
		System.out.print("구입한물건:");
		
//		for(int i=0; i<cart.length ; i++) {
//			tot += cart[i].price;
//			System.out.print( cart[i] + " ");
//		}
		for (Product product : cart) {
			tot += product.price;
			System.out.print( product + ",");
		}
		
		System.out.println();
		System.out.println("사용한 금액:" + tot);
		System.out.println("남은 금액:" + money);
	} // summary()

}


class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}



