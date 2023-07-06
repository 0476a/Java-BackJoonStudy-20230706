package step1_입출력과사칙연산.step2_1000번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// readLine으로 값을 받아오면 문자열을 공백단위로 분리해줘야함!
		String str = bufferedReader.readLine();
		
		// 공백을 기준으로 값을 분리해준다.
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// nextToken을 사용하면 값을 하나씪 받아와준다.
		// 계산을 해야하므로 Integer에 parseInt를 사용하여 int 형으로 변환
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
	}
}
