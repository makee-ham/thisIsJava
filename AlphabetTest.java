package test01;

import java.util.Scanner;
public class AlphabetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ڸ� �Է��ϼ���. => ");
		String s = sc.nextLine();
		// s.toUpperCase(); �빮�ڷ� ������ִ� �޼ҵ�
		// s.toLowerCase(); �ҹ��ڷ�~
		char c = s.charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println("�빮���Դϴ�.");
			System.out.printf("�ҹ��ڴ� %c �Դϴ�.", c+32);
		}
		else if(c>='a' && c<='z') {
			System.out.println("�ҹ����Դϴ�.");
			System.out.printf("�빮�ڴ� %c �Դϴ�.", c-32);
		}
		else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
	}
}
