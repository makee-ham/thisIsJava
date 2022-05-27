package test01;

import java.util.Scanner;
public class YearTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오. => ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.printf("%d년은 윤년입니다.", year);
		}
		else {
			System.out.printf("%d년은 평년입니다.", year);
		}
	}
}
