package step1_입출력과사칙연산.step1_9.step2_1000번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correct3 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받은 값을 공백 단위로 나눠서 배열에 넣어줌.
		String[] str = bufferedReader.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A+B);
	}
}
