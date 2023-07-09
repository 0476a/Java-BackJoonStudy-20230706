package step2_조건문.step1_7.step6_2525번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int time = scanner.nextInt();
		
		scanner.close();
		
		int min = 60 * H + M;
		min += time;
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}
}
