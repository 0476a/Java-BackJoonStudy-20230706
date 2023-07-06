package step1_입출력과사칙연산.step1_9.step1_2557번;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Correct2 {
	public static void main(String[] args) throws IOException {
		
		// Buffered를 사용한다면 임시공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보냄.
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bufferedWriter.write("Hello World!");
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
