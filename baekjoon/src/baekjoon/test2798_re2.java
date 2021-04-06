package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2798_re2 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int arr[] = new int[N];
    	
    	st = new StringTokenizer(br.readLine(), " ");
    	for (int i=0;i<N;i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int resultSum = bestMax(arr, N, M);
    	
    	System.out.println(resultSum);
    	
    }
    
    public static int bestMax(int[] arr, int N, int M) {
    	int sum = 0;
    	for (int i=0;i<N-2;i++) {
    		
    		for (int j=i+1;j<N-1;j++) {
    			
    			for (int k=j+1;k<N;k++) {
    				int temp = arr[i] + arr[j] + arr[k];
    				if (M == temp) {
    					return temp;
    				}
    				if (sum < temp && temp < M) {
    					sum = temp;
    				}
    			}
    		}
    	}
    	
    	return sum;
    }
}	