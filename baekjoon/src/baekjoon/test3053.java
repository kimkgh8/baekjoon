package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class test3053 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		StringBuilder sb = new StringBuilder();
		//sb.append((Math.PI*Math.sqrt(r))).append("\n").append(2*Math.sqrt(r));
		sb.append((Math.PI*r*r)).append("\n").append(2*r*r);
		
		System.out.println(sb);
	}

}
 