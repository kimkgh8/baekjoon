package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class test2742  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int output;
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<N;i++) {
			output = N - i;
			sb.append(output).append("\n");
		}
		System.out.println(sb);
	}
}
