package step2_조건문.step1_7.step4_14681번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x < 0 && y > 0) {
			System.out.println(2);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		} else if(x > 0 && y < 0) {
			System.out.println(4);
		}
		
		scanner.close();
	}
}
