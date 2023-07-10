package step3_반복문.step1_9.step2_10950번;

import java.util.Scanner;

public class Correct1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A+B);
		}
		
		scanner.close();
		
	}
}
