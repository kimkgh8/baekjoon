package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4344 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] arr;
    	int testcase = Integer.parseInt(br.readLine());
    	StringTokenizer st;
    	for (int i=0;i<testcase;i++) {
    		st = new StringTokenizer(br.readLine()," ");
    		int N = Integer.parseInt(st.nextToken());
    		arr = new int[N];
    		double sum = 0;
    		for (int j=0;j<N;j++) {
    			int value = Integer.parseInt(st.nextToken());
    			arr[j] = value;
    			sum += value;
    		}
    		double mean = (sum/N);
    		double cnt =0;
    		
    		for (int j=0;j<N;j++){
    			if (arr[j]>mean) {
    				cnt++;
    			}
    		}
    		System.out.printf("%.3f%%\n",(cnt/N)*100);
    	}
    }
}	