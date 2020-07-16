package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


	public class test2884_d {
		 
		public static void main(String[] args) throws IOException {
	        
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(),",");
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			StringBuilder sb = new StringBuilder();
			
			if ( M < 45) {
				H--;
				M = 60 - (45 - M);
				
				if (H < 0) {
					H = 23;
				}
				sb.append(H).append(" ").append(M);
			} else {
				sb.append(H).append(" ").append(M-45);
			}
			
			System.out.println(sb);
			
		}
		
	}