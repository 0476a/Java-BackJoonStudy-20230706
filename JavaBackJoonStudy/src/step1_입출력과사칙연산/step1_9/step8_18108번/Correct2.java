package step1_입출력과사칙연산.step1_9.step8_18108번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String string = bufferedReader.readLine();
		
		int year = Integer.parseInt(string);
		
		System.out.println(year - 543);
	}
}
