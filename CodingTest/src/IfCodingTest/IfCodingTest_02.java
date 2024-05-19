package IfCodingTest;
import java.util.Scanner;
public class IfCodingTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요. : ");
		int a = sc.nextInt(); int b = sc.nextInt();
		int c = (a > b) ? a : b;
		System.out.print("큰 수 : ");
		System.out.print(c);

	}

}
