package step2_조건문.step1_7.step5_2884번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Correct3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		// 분이 45분 보다 작을 때
		if(minute < 45) {
			hour--;
			minute = 60 - (45 - minute);
			// 시간이 0보다 작아지면 23시로 해줌.
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		} 
		// 분이 45분 보다 클 때
		else {
			System.out.println(hour + " " + (minute - 45));
		}
	}
}
