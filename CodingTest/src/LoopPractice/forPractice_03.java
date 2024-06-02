package LoopPractice;

public class forPractice_03 {

	public static void main(String[] args) {
		int answer = 0; // 출력할 변수 선언
		for(int i = 1; i <= 10; i++) { // 1부터 시작해서 10까지 더한것을
			answer += i; // 더할 때마다 앤서에 대입
		}
		System.out.print(answer);
	}

}