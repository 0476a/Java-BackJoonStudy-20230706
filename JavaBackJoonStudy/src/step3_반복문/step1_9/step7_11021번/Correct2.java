package step3_반복문.step1_9.step7_11021번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (scanner.nextInt() + scanner.nextInt()));
		}
		
		scanner.close();
	}
}
