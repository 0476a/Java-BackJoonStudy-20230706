package step3_반복문.step1_9.step9_2438번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String star = "*";
		
		for(int i = 0; i < N; i++) {
			System.out.println(star);
			star += "*";
		}
		
		scanner.close();
	}
}
