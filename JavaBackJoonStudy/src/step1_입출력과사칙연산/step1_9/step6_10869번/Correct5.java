package step1_입출력과사칙연산.step1_9.step6_10869번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Correct5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strings = bufferedReader.readLine().split(" ");
		
		int A = Integer.parseInt(strings[0]);
		int B = Integer.parseInt(strings[1]);
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
}
