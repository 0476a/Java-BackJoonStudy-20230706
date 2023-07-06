package step1_입출력과사칙연산.step1_9.step6_10869번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		scanner.close();
		
		// StringBuilder를 사용하면 하나의 문자열로 연결 해준 다음 한번에 출력해줌.
		StringBuilder sb = new StringBuilder();
		sb.append(A+B);
		sb.append("\n");
		
		sb.append(A-B);
		sb.append("\n");
		
		sb.append(A*B);
		sb.append("\n");
		
		sb.append(A/B);
		sb.append("\n");
		
		sb.append(A%B);
		
		System.out.println(sb);
	}
}
