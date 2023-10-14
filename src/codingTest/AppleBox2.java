package codingTest;

import java.util.Arrays;

public class AppleBox2 {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int temp = 0;
		int answer = 0;
		
		
		int[] score = {4,1,2,2,4,4,4,4,1,2,4,2,1};
		Arrays.sort(score);
		
		
		System.out.println(Arrays.toString(score));
	
		int a=score.length%m;
		
		while (a < score.length) {
		   answer += score[a]*m;
		    
		    a += m; 
		}
		
		
		System.out.println(answer);
		
		
	}

}
