package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2523 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	int array[]=new int [3];
    	for (int i=0;i<3;i++) {
    		array[i] = Integer.parseInt(st.nextToken());
    	}
    	for (int j=0;j<2;j++) {
    		for (int k=j+1;k<3;k++) {
    			if (array[j] > array[k]) {
    				int temp = array[j];
    				array[j] =  array[k];
    				array[k] = temp;
    			}
    		}
    	}
    	System.out.println(array[1]);
    }
}