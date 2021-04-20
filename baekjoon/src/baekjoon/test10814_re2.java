package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class test10814_re2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr= new String[N][2];
		
		for (int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] e1, String[] e2) {
				System.out.println(Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]));
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<N;i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
