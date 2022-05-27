package test01;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오. >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100) {
			System.out.printf("입력하신 좌표(%d, %d)는 사각형 안에 있는 점입니다.", x, y);
		}
		else {
			System.out.printf("입력하신 좌표(%d, %d)는 사각형 안에 점이 없습니다.", x, y);
		}
	}
}
