package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class test11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		if (!(N<S.length())){
			for (int i=0;i<S.length();i++){
				sum += Integer.parseInt(S.substring(i,i+1));
			}
			System.out.println(sum);
		} else {
			System.out.println("Error");
		}
	}
}
 