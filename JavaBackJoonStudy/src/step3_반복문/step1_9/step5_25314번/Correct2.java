package step3_반복문.step1_9.step5_25314번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		if(N % 4 == 0){
			for(int i = 0; i < N / 4; i++) {
				sb.append("long ");
			}
		}
		
		sb.append("int");
		System.out.println(sb);
	}
}
