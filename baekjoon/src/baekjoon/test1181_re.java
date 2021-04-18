package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class test1181_re {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<String> arr= new TreeSet<String>();
		
		for (int i=0;i<N;i++) {
			arr.add(br.readLine());
		}
		ArrayList<String> sortedArr = new ArrayList<String>(arr);
		Collections.sort(sortedArr, new Comparator<String>() {
			public int compare(String e1, String e2) {
				if (e1.length() < e2.length()) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		
		System.out.println(sortedArr);
	}
}
