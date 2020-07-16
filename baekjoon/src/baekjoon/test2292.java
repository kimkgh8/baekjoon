package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class test2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2;
		
		if (N == 1) {
			System.out.println(1);
		} else {
			while (range <= N) {
				range = range + (6*cnt);
				cnt ++;
			}
			System.out.println(cnt);
		}
	}
}