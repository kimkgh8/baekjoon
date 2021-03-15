package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class test2751 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] arr = new boolean[2000001];
		
		for (int i=0;i<N;i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true; 
		}
		
		for (int j=0;j<2000001;j++) {
			if (arr[j]) {
				sb.append(j-1000000).append("\n");
			}
		}
		System.out.println(sb);
	}
}
 