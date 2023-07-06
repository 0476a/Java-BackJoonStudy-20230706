package step1_입출력과사칙연산.step1_9.step5_1008번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strings = bufferedReader.readLine().split(" ");
		
		double A = Double.parseDouble(strings[0]);
		double B = Double.parseDouble(strings[1]);
		
		System.out.println(A / B);
	}
}
