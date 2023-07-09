package step2_조건문.step1_7.step3_2753번;

import java.util.Scanner;

public class Correct3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		scanner.close();
		System.out.println((year%4 == 0)? ((year%400 == 0)? "1" : (year%100 == 0)? "0" : "1"): "0");
	}
}
