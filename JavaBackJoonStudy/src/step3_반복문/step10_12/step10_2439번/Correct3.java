package step3_반복문.step10_12.step10_2439번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1 ; j <= N - i; j++) {
				sb.append(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				sb.append("*");
			}

			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
