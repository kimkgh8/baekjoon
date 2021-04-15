package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1427_re2 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int[] arr = new int[10];
			
			String N = br.readLine();
			
			for (int i=0;i<N.length();i++) {
				arr[N.charAt(i)-'0']++;
			}
			
			for (int i=9;i>=0;i--) {
				if (arr[i] == 1) {
					System.out.print(i);
				}
			}
			
			
			
		}
}	