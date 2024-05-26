package IfCodingTest;
import java.util.Scanner;
	public class IfCodingTest_05 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int num1 = sc.nextInt(); // 첫번째 정수 선언
		int num2 = sc.nextInt(); // 두번째 정수 선언
		int num3 = sc.nextInt(); // 세번째 정수 선언
		System.out.println("합 : " + (num1 + num2 + num3)); // 세 정수의 합 출력
		System.out.print("평균 : " + (num1 + num2 + num3) / 3); // 세 정수의 평균 출력
		
	}

}
