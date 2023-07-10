package step3_반복문.step1_9.step3_8393번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		
		int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += i + 1;
		}
		
		System.out.println(sum);
	}
}
