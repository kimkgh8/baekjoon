package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class test9020_re {
 
	/*
		false : 소수
		range : 0 ~ 10000
	*/
	public static boolean[] prime = new boolean[10001];
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
		
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int first_partition = n/2;
			int second_partition = n/2;
			
			while(true) {
				if (!prime[first_partition] && !prime[second_partition]) {
					sb.append(first_partition).append(" ").append(second_partition).append("\n");
					break;
				}
			}
		}
		System.out.println(sb);
		
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for (int i=2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) {
				continue;
			}
			for (int j=i*i;j<prime.length;j += i) {
				prime[j] = true;
			}
		}
	}
 
}