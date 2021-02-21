package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test14681_review {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		if (num1 >= 0 && num2 >=0){
			System.out.println(1);
		} 
		if (num1 < 0 && num2 < 0){
			System.out.println(3);
		} 
		if (num1 >= 0 && num2 <0){
			System.out.println(4);
		} 
		if (num1 < 0 && num2 >=0){
			System.out.println(2);
		} 
	
	}

}
