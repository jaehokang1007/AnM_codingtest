package LoopPractice;
import java.util.*;

public class forPractice_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		int min = 0;
		
		for(int i = 1; i <= a; i += 2) {
			sum += i;
			if(i % 2 == 0) min += i;
		}
		System.out.print(sum - min);

	}

}
