package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10996 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int N= Integer.parseInt(br.readLine());
    	
    	for (int i=1;i<=N*2;i++) {
    		if (i%2!=0) {
    			for (int j=0;j<N;++j){
    				if (j%2==0) {
    					sb.append("*");
    				} else {
    					sb.append(" ");
    				}
    			}
    			sb.append("\n");
    		} else {
    			for (int j=0;j<N;++j){
    				if (j%2==0){
    					sb.append(" ");
    				} else {
    					sb.append("*");
    				}
    			}
    			sb.append("\n");
    		}
    	}
    	System.out.println(sb);
    }
}	