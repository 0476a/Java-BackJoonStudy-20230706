package step3_반복문.step1_9.step8_11022번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			
			A = str.charAt(0)-'0';
			B = str.charAt(2)-'0';
			sb.append("Case #").append(i+1).append(": ").append(A)
			.append(" + ").append(B).append(" = ").append(A+B).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
