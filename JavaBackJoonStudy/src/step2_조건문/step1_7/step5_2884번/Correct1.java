package step2_조건문.step1_7.step5_2884번;

import java.util.Scanner;

// 조건식이 없어서 오답!
public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		scanner.close();
		
		int time = (hour * 60) + minute;
		int alarm = time - 45;
		
		System.out.print(alarm / 60 + " ");
		System.out.print(alarm % 60);
	}
}
