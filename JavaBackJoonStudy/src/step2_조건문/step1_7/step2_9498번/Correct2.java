package step2_조건문.step1_7.step2_9498번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		
		System.out.println((grade >= 90)? "A" : (grade >= 80)? "B" : (grade >= 70)? "C" : (grade >= 60)? "D" : "F");
	}
}
