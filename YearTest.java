package test01;

import java.util.Scanner;
public class YearTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. => ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.printf("%d���� �����Դϴ�.", year);
		}
		else {
			System.out.printf("%d���� ����Դϴ�.", year);
		}
	}
}
