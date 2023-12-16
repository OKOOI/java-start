import java.util.Scanner;

public class Yong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
//		boolean loop = true;
		int 금액 = 0;
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택: ");
			int 선택 = scn.nextInt();
			scn.nextLine();
			switch(선택) {
				case 1:
					System.out.print("입금액을 입력하세요: ");
					int 입금액 = scn.nextInt();
					금액 = 입금(금액, 입금액);
					break;
				case 2:
					System.out.print("출금액을 입력하세요: ");
					int 출금액 = scn.nextInt();
					금액 = 출금(금액, 출금액);
					break;
				case 3:
					System.out.println("현재 잔액: " + 금액);
					break;
				case 4:
					System.out.println("시스템을 종료합니다.");
//					loop = false;
					return;
				default :
					System.out.println("잘못된 선택입니다. 다시 선택하여 주세요.");
			}
		}
		
	}
	
	public static int 입금(int 금액, int 입금액) {
		금액 += 입금액;
		System.out.println(입금액 + "원을 입금하였습니다. 현재 잔액: " + 금액);
		return 금액;
	}
	
	public static int 출금(int 금액, int 출금액) {
		if(금액 >= 출금액) {
			금액 -= 출금액;
			System.out.println(출금액 + "원을 출금하였습니다. 현재 잔액: " + 금액);
		}else {
			System.out.println(출금액 + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		return 금액;
	}
	
}