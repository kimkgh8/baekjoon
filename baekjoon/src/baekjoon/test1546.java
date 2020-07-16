package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class test1546 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int count = Integer.parseInt(br.readLine());
    	double arr[] = new double[count];
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	for (int i=0;i<count;i++) {
    		arr[i] =Double.parseDouble(st.nextToken());
    	}
    	double sum =0;
    	Arrays.sort(arr);
    	
    	for (double value:arr) {
    		sum += ((value/arr[count-1])*100);
    	}
    	System.out.println(sum/count);
    	
    }
}	