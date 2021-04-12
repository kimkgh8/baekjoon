package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test2750_re {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int N = Integer.parseInt(br.readLine());
    	
    	//1000까지
    	boolean[] counting = new boolean[2001];
    	
    	for (int i=0;i<N;i++) {
    		counting[Integer.parseInt(br.readLine())+1000] = true;
    	}
    	
    	for (int i=0;i<2001;i++) {
    		if (counting[i]) {
    			sb.append(i-1000).append('\n');
    		}
    	}
    	
    	System.out.println(sb);

    		
    }
}	