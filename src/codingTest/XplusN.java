package codingTest;

import java.util.Arrays;

public class XplusN {

	public static void main(String[] args) {
		 
		int x =2;
		int n =5;
		
		long[] answer = new long[n];
	        
	        for (int i=0; i<n; i++)
	            answer[i] = (long)x*(i+1);
	        
	        // �迭�� ������ Arrays.toString �������.
	        System.out.println(Arrays.toString(answer));
	}

}
