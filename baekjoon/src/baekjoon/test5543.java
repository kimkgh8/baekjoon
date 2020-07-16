package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5543 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int cheapburger=2001;
    	int cheapdrink=2001;
    		for (int i=0;i<3;i++) {
    			int burger = Integer.parseInt(br.readLine());
    			if (burger<cheapburger) {
    				cheapburger = burger;
    			}
    		}
    	
    		for (int j=0;j<2;j++) {
    			int drink = Integer.parseInt(br.readLine());
    			if (drink<cheapdrink) {
    				cheapdrink = drink;
    			}
    	

    		
    		}
			System.out.println((cheapburger+cheapdrink)-50);
    }
}