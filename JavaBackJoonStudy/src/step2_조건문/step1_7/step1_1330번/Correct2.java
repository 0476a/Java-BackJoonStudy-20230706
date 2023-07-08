package step2_조건문.step1_7.step1_1330번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		scanner.close();
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
		
	}
}
