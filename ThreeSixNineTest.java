package test01;

public class ThreeSixNineTest {
	public static void main(String[] args) {
		for (int i = 0; i < 99; i++) {
			int num = i + 1;
			System.out.printf("¼ýÀÚ = %d", num);
			if (num < 10) {
				if(num==3 || num==6 || num==9) {
					System.out.print(" Â¦!");
				}
			}
			else {
				String s = Integer.toString(num);
				char ten = s.charAt(0);
				char one = s.charAt(1);
				if(ten=='3' || ten=='6' || ten=='9') {
					System.out.print(" Â¦!");
				}
				if(one=='3' || one=='6' || one=='9') {
					System.out.print(" Â¦!");
				}
			}
			System.out.println();
		}
	}
}
