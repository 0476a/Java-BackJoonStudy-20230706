package step3_반복문.step10_12.step12_10951번;

import java.util.Scanner;

//입력의 종료는 더이상 읽을 수 있는 데이터(EOF) 가 없을 때 종료함.

// EOF : 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문이 종료됨.

// Scanner에서는 더이상 읽을 데이터가 없으면 NoSuchElementException을 던짐.
// 해결방법
// 1. try-catch문으로 예외발생 시 반복문을 종료해주도록 처리
// 2. Scanner의 메소드인 hanaNext()를 통해 처리

// EOF를 던져주기 위해서는 윈도우에서는 ctrl + Z를 입력 해주면 되고, 리눅스에서는 ctrl + D를 입력해주면 됨.

public class Correct1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// hasNextInt를 사용해주었기 때문에 정수형이 아닌 다른 자료형을 넣으면 오류가 발생하지 않고 입력을 받지 않는다!
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(a+b);
		}
		
		scanner.close();
	}
}
