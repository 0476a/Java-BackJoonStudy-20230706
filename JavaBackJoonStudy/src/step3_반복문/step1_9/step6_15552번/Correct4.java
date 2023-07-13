package step3_반복문.step1_9.step6_15552번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Long.parseLong(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// substring을 사용하여 입력받은 값을 공백을 기준으로 잘라서 받아줌!
		// 출력시 가장 빨리 출력됨.
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");

			int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
			sb.append(result+"\n"); 
		}
		
		br.close();
		System.out.println(sb);
	}
}
