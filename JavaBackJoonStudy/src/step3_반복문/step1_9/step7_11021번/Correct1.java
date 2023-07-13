package step3_반복문.step1_9.step7_11021번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			sb.append("Case #" + (i + 1) + ": ").append(scanner.nextInt() + scanner.nextInt()).append("\n");
		}
		
		System.out.println(sb);
	}
}
