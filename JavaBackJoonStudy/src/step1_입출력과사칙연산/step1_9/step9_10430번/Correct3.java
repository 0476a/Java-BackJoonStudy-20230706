package step1_입출력과사칙연산.step1_9.step9_10430번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bufferedReader.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
		
	}
}
