package step3_반복문.step1_9.step3_8393번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += i + 1;
		}
		
		System.out.println(sum);
	}
}
