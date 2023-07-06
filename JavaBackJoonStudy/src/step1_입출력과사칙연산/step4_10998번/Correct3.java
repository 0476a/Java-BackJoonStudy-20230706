package step1_입출력과사칙연산.step4_10998번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strings = bufferedReader.readLine().split(" ");
		
		int A = Integer.parseInt(strings[0]);
		int B = Integer.parseInt(strings[1]);
		
		System.out.println(A*B);
	}
}
