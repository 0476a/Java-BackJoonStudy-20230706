package step1_입출력과사칙연산.step1_9.step9_10430번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A + B) % C );
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C );
		System.out.println(((A % C) * (B % C)) % C);
		
		scanner.close();
	}
}
