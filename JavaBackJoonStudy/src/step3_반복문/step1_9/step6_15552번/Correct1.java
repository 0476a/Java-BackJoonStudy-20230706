package step3_반복문.step1_9.step6_15552번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


// 기존에 쓰던 Scanner를 사용하면 시간이 초과하므로 오답처리됨.
// BufferedReader와 BufferedWriter에 StringBuilder까지 사용하여 풀어보았다!
public class Correct1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long T = Long.parseLong(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			sb.append(A+B + "\n");
		}
		
		bw.write("" + sb);
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}
