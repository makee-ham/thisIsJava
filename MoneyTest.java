package test01;

import java.util.Scanner;
public class MoneyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 가격을 입력하세요. => ");
		int cost = sc.nextInt();
		System.out.print("지불 금액을 입력하세요. => ");
		int pay = sc.nextInt();
		int change = pay-cost;

		System.out.printf("상품가격 : %d\n", cost);
		System.out.printf("지불금액 : %d\n", pay);
		System.out.printf("거스름돈 : %d\n", change);

		System.out.println("거스름돈 내역");
		System.out.println("=====================================");

		int _50000 = 0, _10000 = 0, _5000=0, _1000=0, _500=0, _100=0, _50=0, _10=0, _1=0;
		// _숫자만 들어가있으면 상수처럼 보임. 마치 'final Int_숫자'처럼 (final 키워드는 변수 앞에 붙으면 상수를 만든다)
		if(change >= 50000) {
			_50000 = change / 50000;
			change -= _50000 * 50000;
		}
		if(change >= 10000) {
			_10000 = change/10000;
			change -= _10000*10000;
		}
		if(change >= 5000) {
			_5000 = change/5000;
			change -= _5000*5000;
		}
		if (change >= 1000) {
			_1000 = change/1000;
			change -= _1000*1000;
		}
		if(change >= 500) {
			_500 = change/500;
			change -= _500*500;
		}
		if(change >= 100) {
			_100 = change/100;
			change -= _100*100;
		}
		if(change >= 50) {
			_50 = change/50;
			change -= _50*50;
		}
		if(change >= 10) {
			_10 = change/10;
			change -= _10*10;
		}
		if(change >= 1) {
			_1 = change;
		}

		System.out.printf("50000원권 : %d장\n", _50000);
		System.out.printf("10000원권 : %d장\n", _10000);
		System.out.printf("5000원권 : %d장\n", _5000);
		System.out.printf("1000원권 : %d장\n", _1000);
		System.out.printf("500원권 : %d장\n", _500);
		System.out.printf("100원권 : %d장\n", _100);
		System.out.printf("50원권 : %d개\n", _50);
		System.out.printf("10원권 : %d개\n", _10);
		System.out.printf("1원권 : %d개", _1);
	}
}
