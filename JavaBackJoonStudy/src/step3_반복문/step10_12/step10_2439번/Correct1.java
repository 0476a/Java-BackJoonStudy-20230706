package step3_반복문.step10_12.step10_2439번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1 ; j <= N - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}
