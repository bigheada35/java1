package c15.v4.ex.jungsuk56p.ex7_19;

/**
잔액이 부족하여 을 를 살수 없습니다 Computer / .
구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
사용한 금액:850
남은 금액:150
 */
public class ex7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
		
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+ p +"을 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}

	void add(Product p) {
		if(i>= cart.length) {
			Product[] temp = new Product[cart.length *2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
		cart[i] = p;
		i++;
	}

	void summary() {
		int sum=0;
		// 주의 : 이렇게 처리 하는 방법도 있음. --> str="", 
		// 주의 : String str=null 을 넣으면  null,Tv,Computer,Tv,Audio,Computer,Computer, 처럼 나온다
		String str="";
		for (Product product : cart) {
			str +=  product.toString() +",";
			sum += product.price;
		}
		System.out.println("구입한 물건: " + str);
		System.out.println("사용한 금액:"+ sum);
		System.out.println("남은 금액:"+ money);
	}
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
