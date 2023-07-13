package step3_반복문.step1_9.step5_25314번;

import java.util.Scanner;

public class Correct1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String lg = "";
		
		if(N % 4 == 0){
			int b = N / 4;
			for(int i = 0; i < b; i++) {
				lg += "long ";
			}
		}
		
		scanner.close();
		
		System.out.println(lg + "int");
	}
}
