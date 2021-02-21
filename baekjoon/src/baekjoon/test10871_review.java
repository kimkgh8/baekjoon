package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10871_review {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<n;i++){
			int val = Integer.parseInt(st.nextToken());
			if (val < x ) {
				sb.append(val).append(" ");
			}
		}
		System.out.println(sb);
		
		
	}

}
