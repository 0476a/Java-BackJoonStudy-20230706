package step1_입출력과사칙연산.step10_13.step10_2588번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		String B = scanner.next();
		
		scanner.close();
		
		// chatAt()는 각 자리수를 참조해줌.
		// - '0' 을 하는 이유는 문자를 숫자로 변환하여 반환함!
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
		
	}
}
