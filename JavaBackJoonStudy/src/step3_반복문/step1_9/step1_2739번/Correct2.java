package step3_반복문.step1_9.step1_2739번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
		}
	}
}
