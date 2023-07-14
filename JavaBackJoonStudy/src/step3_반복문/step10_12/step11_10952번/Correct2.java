package step3_반복문.step10_12.step11_10952번;

import java.util.Scanner;

public class Correct2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			if(A==0 && B==0) {
				scanner.close();
				break;
			}
			System.out.println(A+B);
		}
		
	}
}
