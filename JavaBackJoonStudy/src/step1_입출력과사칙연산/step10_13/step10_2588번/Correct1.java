package step1_입출력과사칙연산.step10_13.step10_2588번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int onesDigit = B % 10;
		int tensDigit = (B % 100)/10;
		int hundredDigit = B /100;
		
		System.out.println(A * onesDigit);
		System.out.println(A * tensDigit);
		System.out.println(A * hundredDigit);
		System.out.println(A * B);
		
		scanner.close();
	}
}
