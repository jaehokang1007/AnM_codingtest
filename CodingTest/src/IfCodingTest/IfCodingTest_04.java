package IfCodingTest;
import java.util.Scanner;
	public class IfCodingTest_04 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int Score = sc.nextInt(); // 점수 변수 선언
		System.out.print("학년을 입력하세요. : ");
		int Grade = sc.nextInt(); // 학년 점수 선언
		if(Grade == 1 || Grade == 2 && Score >= 60) // 1학년이거나 2학년이면서 60점 이상일 경우 합격 출력
			System.out.print("합격입니다.");
		else if(Grade == 3 && Score >= 70) // 3학년이면서 70점 이상이라면 합격 출력
			System.out.print("합격입니다.");
		else System.out.print("불합격입니다."); // 나머지 불합격

	}

}
