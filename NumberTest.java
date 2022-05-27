package test01;

import java.util.Scanner;
public class NumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess = 0, count = 1;
		
		while (true) {
			System.out.print("1~100 사이의 임의의 정수를 입력하세요. => ");
			guess = sc.nextInt();
			if(guess < answer) {
				System.out.println("더 큰 수를 입력하세요.");
				count++;
			}
			else if(guess > answer) {
				System.out.println("더 작은 수를 입력하세요.");
				count++;
			}
			else {
				System.out.printf("정답입니다! 시도 횟수는 %d 입니다.", count);
				break;
			}
		}
	}
}
