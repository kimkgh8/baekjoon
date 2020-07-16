package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2446 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int N = Integer.parseInt(br.readLine());
    	for (int i = 1;i<=2*N-1;i++) {
    		if (i<=N) {
	            for (int j=1;j<i;j++) {
		               sb.append(" ");
		            }
    			for (int k=i;k<=2*N-i;k++) {
    				sb.append("*");
    			}
    			sb.append("\n");
    		} else {
    			for (int j=1;j<=2*N-1-i;j++) {
    				sb.append(" ");
    			}
    			for (int k=2*N-1-i+1;k<=i;k++) {
    				sb.append("*");
    			}
    			sb.append("\n");
    		}
    	}
    	System.out.println(sb);
    	
    }
}	