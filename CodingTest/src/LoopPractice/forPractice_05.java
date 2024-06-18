package LoopPractice;
import java.util.Scanner;

public class forPractice_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0; // 변수 선언
		
		for(int i = 1; i <= a; i += 2) {
			sum += i; // 홀수인 수 sum에 전부 다 더하고
		}
		for(int j = 0; j <= a; j += 2) {
			sum -= j; // 짝수인 수 다 더해서 빼기
		}
		System.out.print(sum);

	}

}
