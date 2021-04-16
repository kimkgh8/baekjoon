package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1427_re3 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String N = br.readLine();
			
			int[] arr = new int[10];
			
			for (int i=0;i<N.length();i++) {
				arr[N.charAt(i)-'0']++;
			}
			
			
			//내림차순
			/*
			for (int i=9;i>=0;i--) {
				if (arr[i]==1) {
					System.out.println(i);
				}
			}
			*/
			//오름차순
			for (int i=0;i<=N.length();i++) {
				if (arr[i]==1) {
					System.out.println(i);
				}
			}
			
		}
}	