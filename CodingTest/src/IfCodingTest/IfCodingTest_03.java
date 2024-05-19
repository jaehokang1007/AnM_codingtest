package IfCodingTest;
import java.util.Scanner;
public class IfCodingTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요.(단위 : 원) : ");
		double a = sc.nextInt();
		double b = a / 1260;
		System.out.print(a + "원은 $" + b + "입니다.");

	}

}
