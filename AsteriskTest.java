package test01;

import java.util.Scanner;
public class AsteriskTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��Ͻÿ�. >> ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {  // index�� 0���� �����ν� �ι�° ���� ���ǿ��� for���� �� �� ������ �� ���� Ȯ���� �� �ֵ��� �Ѵ�.
			for (int j = 0; j < (num - i); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}