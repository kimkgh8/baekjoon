package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class test1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=M;i<N;i++) {
			boolean result = isPrimeNumber(i);
			if (result) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
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
 	