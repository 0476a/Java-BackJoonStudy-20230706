package step3_반복문.step1_9.step4_25304번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		int a;
		int b;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			sum += a * b;
		}
		
		scanner.close();
		
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
