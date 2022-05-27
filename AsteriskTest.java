package test01;

import java.util.Scanner;
public class AsteriskTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오. >> ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {  // index를 0으로 둠으로써 두번째 제한 조건에서 for문이 몇 번 도는지 한 눈에 확인할 수 있도록 한다.
			for (int j = 0; j < (num - i); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}