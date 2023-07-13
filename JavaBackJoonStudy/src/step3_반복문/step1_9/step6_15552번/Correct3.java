package step3_반복문.step1_9.step6_15552번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long T = Long.parseLong(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			sb.append(A + B).append("\n"); 
		}
		br.close();
		
		// bufferedWriter 보다 데이터가 작을 때 빠르지만 데이터가 많아지면 bufferedWriter가 더 빨라짐.
		System.out.println(sb);
	}
}
