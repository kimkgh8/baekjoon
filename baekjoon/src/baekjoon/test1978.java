package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int resultCnt = 0;
		for (int i=0;i<number;i++) {
			boolean result = isPrimeNumber(Integer.parseInt(st.nextToken()));
			if (result) {
				resultCnt++;
			}
		}
		System.out.println(resultCnt);
		
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number == 1) {
			return false;
		}
		for (int i=2;i<number;i++) {
			if (number % i == 0 ) {
				return false;
			}
		}
		return true;
	}

}
