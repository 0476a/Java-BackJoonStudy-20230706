package step1_입출력과사칙연산.step1_9.step6_10869번;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		scanner.close();
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bufferedWriter.write((A+B) + "\n");
		bufferedWriter.write((A-B) + "\n");
		bufferedWriter.write((A*B) + "\n");
		bufferedWriter.write((A/B) + "\n");
		bufferedWriter.write((A%B) + "\n");
		
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
