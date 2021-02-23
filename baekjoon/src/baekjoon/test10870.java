package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10870 {
 
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = fibonacci(N);
		System.out.println(sum);
		
	}
	
	public static int fibonacci(int N) {
		if(N == 0) return 0;	// 재귀 종료조건
		if(N == 1) return 1;	// 재귀 종료조건
		return fibonacci(N - 1) + fibonacci(N - 2);		
	}
 
}