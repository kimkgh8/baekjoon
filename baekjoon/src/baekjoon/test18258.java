package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

 
public class test18258 {
	static LinkedList<Integer> arr = new LinkedList<Integer>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int N =Integer.parseInt(br.readLine());
		for (int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String comand = st.nextToken();
			if (comand.equals("push")) {
				push(arr,Integer.parseInt(st.nextToken()));
			}
			if (comand.equals("pop")) {
				pop(arr);
			}
			if (comand.equals("size")) {
				size(arr);
			}
			if (comand.equals("empty")) {
				empty(arr);
			}
			if (comand.equals("front")) {
				front(arr);
			}
			if (comand.equals("back")) {
				back(arr);
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void push(LinkedList<Integer> arr, int x) {
		arr.add(x);
	}
	
	public static void pop(LinkedList<Integer> arr) {
		if (arr.size() == 0) {
			sb.append("-1").append("\r\n");
		} else {
			int topNumber = arr.getFirst();
			sb.append(topNumber).append("\r\n");
			arr.remove(arr.getFirst());
		}
	}
	
	public static void size(LinkedList<Integer> arr) {
		sb.append(arr.size()).append("\r\n");
	}
	
	public static void empty(LinkedList<Integer> arr) {
		if (arr.size() == 0) {
			sb.append(1).append("\r\n");
		} else {
			sb.append(0).append("\r\n");
		}
	}
	public static void front(LinkedList<Integer> arr) {
		if (arr.size() == 0) {
			sb.append("-1").append("\r\n");
		} else {
			sb.append(arr.getFirst()).append("\r\n");
		}
		
	}	
	public static void back(LinkedList<Integer> arr) {
		if (arr.size() == 0) {
			sb.append("-1").append("\r\n");
		} else {
			sb.append(arr.getLast()).append("\r\n");
		}
	}	
}
 