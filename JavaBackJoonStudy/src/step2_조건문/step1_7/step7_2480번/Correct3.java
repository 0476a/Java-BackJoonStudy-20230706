package step2_조건문.step1_7.step7_2480번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader 사용
public class Correct3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
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
