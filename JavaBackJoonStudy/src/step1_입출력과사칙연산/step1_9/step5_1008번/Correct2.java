package step1_입출력과사칙연산.step1_9.step5_1008번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bufferedReader.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A / B);
	}

}