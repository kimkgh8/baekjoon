package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class test5086 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	while (true) {
    		StringTokenizer st = new StringTokenizer(br.readLine()," ");
    		int firstNum = Integer.parseInt(st.nextToken());
        	int secondNum = Integer.parseInt(st.nextToken());
        	if (firstNum == 0 && secondNum == 0) {
        		break;
        	}
        	if (secondNum % firstNum==0) {
        		System.out.println("factor");
        	} else if (firstNum % secondNum==0) {
        			System.out.println("multiple");            		
            } else {
            	System.out.println("neither");
        	}
    	}
    }
}	