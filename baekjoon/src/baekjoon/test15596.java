package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class test15596 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int arr[] = new int[n];
	for (int i=1;i<=arr.length;i++) {
		arr[i-1] = i;
	}
	System.out.println(sum(arr));;
	}
	
	
	static long sum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;	
	}

}
 