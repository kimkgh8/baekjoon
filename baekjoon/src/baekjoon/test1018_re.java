package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1018_re {
	public static boolean[][] arr;
	public static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new boolean[N][M];
		
		// 체스판 채우기
		for (int i=0;i<N;i++) {
			String str = br.readLine();
			for (int j=0;j<M;j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else  {
					arr[i][j] = false;
				}
			}
		}
		
		int n_row = N - 7;
		int m_col = M - 7;
		
		for (int i=0;i<n_row;i++) {
			for (int j=0;j<m_col;j++) {
				//메소드
			}
		}
		System.out.println(min);
	}
	
	public static void find(int x, int y) {
		
		
	}

}