package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2884_review {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int our = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		if (min < 45) {
			if (our ==0) {
				our = 23;
			} else {
				our = our -1;
			}
			min = (min + 60) - 45;
		} else {
			min = min -45;
		}
		
		System.out.println(our +" " + min );
	}

}
