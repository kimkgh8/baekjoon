package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10818 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N =Integer.parseInt(br.readLine());
    	int [] Array = new int [N];
    	int Max = -1000000;
    	int Min = 1000000;
    	StringBuilder sb = new StringBuilder(); 
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	for (int i=0;i<N;i++) {
    		int value = Integer.parseInt(st.nextToken());
    		Array[i] = value;
    	}
    	for (int j=0;j<N;j++) {
    		if (Max < Array[j]) {
    			Max = Array[j];
    		}
    		if (Min > Array[j]) {
    			Min = Array[j];
    		}
    	}
    	sb.append(Min).append(" ").append(Max);
    	System.out.println(sb);
    }
}	