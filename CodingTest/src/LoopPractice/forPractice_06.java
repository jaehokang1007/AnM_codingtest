package LoopPractice;
import java.util.*;

public class forPractice_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= a; i += 2) {
			sum += i;
		}
		for(int j = 0; j <= a; j += 2) {
			sum -= j;
			System.out.print(sum);
		}

	}

}
