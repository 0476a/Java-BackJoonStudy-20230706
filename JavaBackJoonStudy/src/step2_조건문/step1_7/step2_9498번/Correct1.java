package step2_조건문.step1_7.step2_9498번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		
		if( grade < 101 && 89 < grade ) {
			System.out.println("A");
		} else if (grade < 90 && 79 < grade) {
			System.out.println("B");
		} else if (grade < 80 && 69 < grade) {
			System.out.println("C");
		} else if (grade < 70 && 59 < grade) {
			System.out.println("D");
		} else if (grade < 60) {
			System.out.println("F");
		} else {
			System.out.println("입력 오류");
		}
		
		scanner.close();
	}
}
