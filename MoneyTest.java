package test01;

import java.util.Scanner;
public class MoneyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ ������ �Է��ϼ���. => ");
		int cost = sc.nextInt();
		System.out.print("���� �ݾ��� �Է��ϼ���. => ");
		int pay = sc.nextInt();
		int change = pay-cost;

		System.out.printf("��ǰ���� : %d\n", cost);
		System.out.printf("���ұݾ� : %d\n", pay);
		System.out.printf("�Ž����� : %d\n", change);

		System.out.println("�Ž����� ����");
		System.out.println("=====================================");

		int _50000 = 0, _10000 = 0, _5000=0, _1000=0, _500=0, _100=0, _50=0, _10=0, _1=0;
		// _���ڸ� �������� ���ó�� ����. ��ġ 'final Int_����'ó�� (final Ű����� ���� �տ� ������ ����� �����)
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

		System.out.printf("50000���� : %d��\n", _50000);
		System.out.printf("10000���� : %d��\n", _10000);
		System.out.printf("5000���� : %d��\n", _5000);
		System.out.printf("1000���� : %d��\n", _1000);
		System.out.printf("500���� : %d��\n", _500);
		System.out.printf("100���� : %d��\n", _100);
		System.out.printf("50���� : %d��\n", _50);
		System.out.printf("10���� : %d��\n", _10);
		System.out.printf("1���� : %d��", _1);
	}
}
