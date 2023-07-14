package step3_반복문.step1_9.step9_2438번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Correct5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		
		for(int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			// 줄바꿈을 해준다.
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
}
