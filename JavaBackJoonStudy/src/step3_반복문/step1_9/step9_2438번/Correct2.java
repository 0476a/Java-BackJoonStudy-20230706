package step3_반복문.step1_9.step9_2438번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
