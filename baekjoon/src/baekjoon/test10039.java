package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10039 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int sum =0;
    	
    	for (int i=0;i<5;i++) {
    		int A = Integer.parseInt(br.readLine());
    		sum += A>40?A:40;
    	}
    	System.out.println(sum/5);
    	
    	
    	
    }
}