package step1_입출력과사칙연산.step10_13.step11_11382번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 큰 값이 출력될 수 있기 때문에 long 자료형을 사용해야함!
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long C = scanner.nextLong();
		
		scanner.close();
		System.out.println(A + B + C);
	}
}
