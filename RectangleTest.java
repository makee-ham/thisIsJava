package test01;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�. >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100) {
			System.out.printf("�Է��Ͻ� ��ǥ(%d, %d)�� �簢�� �ȿ� �ִ� ���Դϴ�.", x, y);
		}
		else {
			System.out.printf("�Է��Ͻ� ��ǥ(%d, %d)�� �簢�� �ȿ� ���� �����ϴ�.", x, y);
		}
	}
}
