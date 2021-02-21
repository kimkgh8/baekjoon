package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1110_review {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		String new_N = String.valueOf(N);
		if (N<10) {
			new_N = "0" + new_N;
		}
		
		while(true) {
			cnt++;
			int firstNumber = Integer.parseInt(new_N.substring(0,1));
			int lastNumber = Integer.parseInt(new_N.substring(new_N.length()-1));
			int sum = firstNumber + lastNumber;
			String sum_String = String.valueOf(sum);
			String sum_LastNumber = sum_String.substring(sum_String.length()-1);
			//System.out.println("sum_LastNumber : " + sum_LastNumber);
			new_N = lastNumber+sum_LastNumber;
			//System.out.println("new_N : " + new_N);
			if (Integer.parseInt(new_N)==N){
				System.out.println(cnt);
				break;
			}
		}
	}
}
