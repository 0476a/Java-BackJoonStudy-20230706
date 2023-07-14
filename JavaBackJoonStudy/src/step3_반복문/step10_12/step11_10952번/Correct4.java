package step3_반복문.step10_12.step11_10952번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			
			// 48을 빼주는 건 '0'을 빼주는 것과 같이 정수형태로 바꿔주는 것이다.
			// 이것도 A와 B의 수가 한자리 수이기 때문에 가능한 로직이다!
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
			
			if(A==0 && B==0) {
				break;
			}
			
			sb.append((A+B)).append("\n");
		}
		System.out.println(sb);
		
	}
}
