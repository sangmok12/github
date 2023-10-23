package codingTest;

import java.util.Arrays;

public class BestArray {

	public static void main(String[] args) {
		int n = 2;
		int s = 8;
		int[] answer = new int[n];
		
//		int s2 = (s-1)/2;
//		int[] answer2 = new int[s2];
//		
		if (s == 1)
			answer = new int[]{-1};
		else {
//			int cnt = 1;
//			for (int i=0;i<s2;i++) {
//				answer2[i] = cnt*(s-cnt);
//				cnt++;
//			}
//			
//			Arrays.sort(answer2);
			
		answer = new int[] {s/2,s%2==1? s/2+1:s/2};
			
			
			
			
		}
		
		
		System.out.println(Arrays.toString(answer));
		
	}

}
