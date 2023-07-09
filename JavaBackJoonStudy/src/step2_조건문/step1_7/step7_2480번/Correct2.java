package step2_조건문.step1_7.step7_2480번;

import java.util.Scanner;

// 랜덤을 사용 X
// 랜덤을 사용하니 오류 발생
public class Correct2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		scanner.close();
		
		// 모든 변수가 다른 경우
		if(A != B && B != C && A != C) {
			// 가장 큰 값을 고르는 로직
			int max;
			if(A > B) {
				if(C > A) {
					max = C;
				} else {
					max = A;
				}
			} else {
				if(C > B) {
					max = C;
				} else {
					max = B;
				}
			}
			System.out.println(max * 100);
		} else {
			// 3개의 변수가 모두 같은 경우
			if(A == B && A == C) {
				System.out.println(10000 + A * 1000);
			} else {
				// A가 B 혹은 C랑만 같은 경우
				if(A == B || A == C) {
					System.out.println(1000 + A * 100);
				} // B가 C랑만 같은 경우
				else {
					System.out.println(1000 + B * 100);
				}
			}
		}
		
	}
}
