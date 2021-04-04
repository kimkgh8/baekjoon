package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1110_re {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String n = br.readLine();
    	int cnt = 0;
    	int sum = 0;
    	if (n.length() == 1) {
    		n = 0 +n;
    	}
    	String newN = n;
    	while (true) {
    		cnt++;
    		int start = Integer.parseInt(newN.substring(0,1));
    		int end = Integer.parseInt(newN.substring(1,newN.length()));
    		sum = start + end;
			String sumString = String.valueOf(sum);
			// 자릿수가1이면
			if (sumString.length() == 1) {
				newN =  String.valueOf(end) + sumString;
			} else {
				newN = String.valueOf(end) + sumString.substring(1,sumString.length());
			}
			if (newN.equals(n)) {
				break;
			}
    	}
    	System.out.println(cnt);
    	
    }
}	