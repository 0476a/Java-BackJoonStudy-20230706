package step3_반복문.step1_9.step7_11021번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class Correct5 {
	// 무조건 A와 B의 수가 0보다 크고 10보다 작아야 하므로 공백의 배열은 [1] 일 수 밖에 없다!
	// 따라서 다음과 같이 charAt을 사용해서 보다 빠르게 출력이 가능하다!
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0' + str.charAt(2)-'0').append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}
