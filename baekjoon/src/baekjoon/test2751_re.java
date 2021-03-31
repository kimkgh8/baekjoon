package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class test2751_re {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] arr = new boolean[2000001];
		
		for (int i=0;i<N;i++) {
			arr[Integer.parseInt(br.readLine()) + 100000] = true;
		}
		
		for (int i=0;i<2000001;i++) {
			if (arr[i]) {
				sb.append(i-100000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
 