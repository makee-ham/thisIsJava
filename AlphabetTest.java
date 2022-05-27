package test01;

import java.util.Scanner;
public class AlphabetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 입력하세요. => ");
		String s = sc.nextLine();
		// s.toUpperCase(); 대문자로 만들어주는 메소드
		// s.toLowerCase(); 소문자로~
		char c = s.charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println("대문자입니다.");
			System.out.printf("소문자는 %c 입니다.", c+32);
		}
		else if(c>='a' && c<='z') {
			System.out.println("소문자입니다.");
			System.out.printf("대문자는 %c 입니다.", c-32);
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
	}
}
