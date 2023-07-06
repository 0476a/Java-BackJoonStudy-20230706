package step1_입출력과사칙연산.step2_1000번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		System.out.println(A + B);
		
		// 사용한 리소스를 명시적으로 해제가능, 필수는 아니지만 습관을 길러두면 좋음!
		scanner.close();
	}
}
