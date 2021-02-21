package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class test2739  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int output;
		StringBuilder sb = new StringBuilder();
		
		for (int i=1;i<=9;i++) {
			output = N * i;
			sb.append(N).append(" * ").append(i).append(" = ").append(output).append("\n");
			
		}
		System.out.println(sb);
	}
}