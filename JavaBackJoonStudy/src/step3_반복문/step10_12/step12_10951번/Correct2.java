package step3_반복문.step10_12.step12_10951번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader를 사용할 때는 null일 경우에 반복문을 종료하도록 해준다.

public class Correct2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		// str의 받은 값이 null일 경우에 반복문을 종료 시킨다. 즉, 값이 없다면 종료시키는 것이다!
		while((str = br.readLine()) != null) {
			
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		
		System.out.println(sb);
	}
}
