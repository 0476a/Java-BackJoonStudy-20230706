package step1_입출력과사칙연산.step1_9.step9_10430번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( (A+B)%C );
		sb.append("\n");
		
		sb.append( (A%C + B%C)%C );
		sb.append("\n");
		
		sb.append( (A*B)%C );
		sb.append("\n");
		
		sb.append( (A%C * B%C)%C );
		
		System.out.println(sb);
		
	}
}
