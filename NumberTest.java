package test01;

import java.util.Scanner;
public class NumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
		int guess = 0, count = 1;
		
		while (true) {
			System.out.print("1~100 ������ ������ ������ �Է��ϼ���. => ");
			guess = sc.nextInt();
			if(guess < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
				count++;
			}
			else if(guess > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
				count++;
			}
			else {
				System.out.printf("�����Դϴ�! �õ� Ƚ���� %d �Դϴ�.", count);
				break;
			}
		}
	}
}
