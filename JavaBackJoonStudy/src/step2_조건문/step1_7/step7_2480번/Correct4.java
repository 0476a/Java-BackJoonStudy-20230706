package step2_조건문.step1_7.step7_2480번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Math 사용
public class Correct4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		// 모든 변수가 다른 경우
		if(A != B && B != C && A != C) {
			// Math를 사용하여 가장 큰 값을 찾음.
			int max = Math.max(A, Math.max(B, C));
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
