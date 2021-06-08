package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

 
public class test10773 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		int sum = 0;
		for (int i=0;i<K;i++) {
			int number = Integer.parseInt(br.readLine());
			if (number ==0 ) {
				arr.remove(arr.getLast());
			} else {
				arr.add(number);
			}
		}
		
		for (int num:arr) {
			sum += num;
		}
		System.out.println(sum);
		
	}	
}
 