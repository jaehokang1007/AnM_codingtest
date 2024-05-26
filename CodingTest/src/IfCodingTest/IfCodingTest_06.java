package IfCodingTest;
import java.util.Scanner;
	public class IfCodingTest_06 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 입력할 정수 선언
		if(num < 0) System.out.println("음수"); // 정수가 0보다 작다면 음수 출력
		else if(num > 0) System.out.println("양수"); // 정수가 0보다 크면 양수 출력
		if(num % 2 == 0) System.out.println("짝수"); // 정수를 2로 나눈 나머지가 0이라면 짝수 출력
		else if(num % 2 != 0) System.out.println("홀수"); // 정수를 2로 나눈 나머지가 0이 아니라면 홀수 출력

	}

}
	