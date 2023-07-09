package step2_조건문.step1_7.step7_2480번;

import java.util.Random;

// 돌아는 가는데 오답
public class Correct1 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int A = random.nextInt(6) + 1;
		int B = random.nextInt(6) + 1;
		int C = random.nextInt(6) + 1;
		int max = A;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		if(A != B && A != C && B != C) {
			if(B > max) {
				max = B;
			}
			if(C > max) {
				max = C;
			}
			System.out.println(max * 100);
		}
		
		if(A == B && A != C ) {
			System.out.println(A * 100 + 1000);
		} else if (A == C && A != B ) {
			System.out.println(A * 100 + 1000);
		} else if (B == C && A != B ) {
			System.out.println(B * 100 + 1000);
		}
		
		if(A == B && A == C) {
			System.out.println(A * 1000 + 10000);
		}
	}
}
