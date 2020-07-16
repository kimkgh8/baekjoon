package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class test1065 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));

	}

	public static int arithmetic_sequence(int value) {
		int cnt = 0;
		if (value<100) {
			return value;
		} else {
			cnt = 99;
			if (value == 1000) {
				value =999;
			}
			for (int i=100;i<=value;i++) {
				int hun = i /100;
				int ten = (i /10) % 10;
				int one = i % 10;
				
				if ((hun-ten) == (ten-one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
}
 