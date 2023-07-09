package step2_조건문.step1_7.step5_2884번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		// 분이 45분 보다 작을 때
		if(minute < 45) {
			if(hour == 0) {
				hour = 23;
				sb.append(hour).append(" ");
			} else {
				hour--;
				sb.append(hour).append(" ");
			}
			sb.append(minute = 60 - (45 - minute));
		} 
		// 분이 45분 보다 클 때
		else {
			sb.append(hour).append(" ").append(minute - 45);
		}
		
		System.out.println(sb);
	}
}
