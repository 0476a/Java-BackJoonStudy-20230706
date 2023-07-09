package step3_반복문.step1_9.step1_2739번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
		}
	}
}
