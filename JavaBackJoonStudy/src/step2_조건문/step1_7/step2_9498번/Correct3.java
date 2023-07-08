package step2_조건문.step1_7.step2_9498번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int grade = Integer.parseInt(br.readLine());
		
		System.out.println((grade >= 90)? "A" : (grade >= 80)? "B" : (grade >= 70)? "C" : (grade >= 60)? "D" : "F");
	}
}
