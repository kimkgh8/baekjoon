package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class test18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[N];
		for (int i = 0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] clone = arr.clone();
		
		Arrays.sort(clone);
		
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for (int n:clone) {
			if (!map.containsKey(n)) {
				map.put(n, idx++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int n:arr) {
			sb.append(map.get(n)).append(' ');
		}
		System.out.println(sb);
	}
}
