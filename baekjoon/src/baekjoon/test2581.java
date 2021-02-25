package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;



public class test2581  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		ArrayList<Integer> min = new ArrayList<Integer>(); 
		if (M <= N) {
			for (int i = M;i<N; i++) {
				boolean result = isPrimeNumber(i);
				if (result) {
					sum += i;
					min.add(i);
				}
			}
			if (sum == 0) {
				System.out.println(-1);
			} else {
				Arrays.sort(min.toArray());
				System.out.println(sum);
				System.out.println(min.get(0));
			}
		}
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
