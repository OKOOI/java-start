package cond;

public class If5Yong {
	public static void main(String agrs[]) {
		int price = 15000;
		int age = 20;
		int discount = 0;
		
		if (price >= 10000) {
			discount = discount + 1000;
			System.out.println("10000원 이상 구매시 1000원 할인");
		}
		if (age >= 10) {
			discount = discount + 1000;
			System.out.println("10살 이상 구매시 1000원 할인");
		}
		System.out.println("총 할인금액 : " + discount + "원 입니다.");
	}

}
