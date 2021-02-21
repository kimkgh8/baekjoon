package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2439_review {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for (int i=0;i<star;i++) {
			for (int j=star;j>0;j--) {
				if (i>=j-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
