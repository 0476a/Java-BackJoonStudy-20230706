package step3_반복문.step10_12.step12_10951번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Correct3 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			
			// a와 b의 값이 한자리 수이기 때문에 가능함!
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
			
		}
		
		System.out.println(sb);
	}
}
