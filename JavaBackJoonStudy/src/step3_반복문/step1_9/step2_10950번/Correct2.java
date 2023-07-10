package step3_반복문.step1_9.step2_10950번;

import java.util.Scanner;

public class Correct2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int arr[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			arr[i] = A + B;
		}
		
		scanner.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
		
	}
}
