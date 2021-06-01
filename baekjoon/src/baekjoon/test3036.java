package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class test3036 {
	public static int[][] APT = new int[15][15];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// 첫 번째 링
		int firstRing = Integer.parseInt(st.nextToken());
 
		for (int i = 1; i < N; i++) {
			
			int otherRing = Integer.parseInt(st.nextToken());
			
			// 기약분수로 만들기 위한 최대공약수 찾기
			int gcd = gcd(firstRing, otherRing);
 
			// 분모와 분자를 최대공약수로 나눠주기 
			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
	}
	
	
	// 최대공약수 반복문 방식
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b; // 나머지를 구해준다.
 
			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;
			b = r;
		}
		return a;
	}
}
 