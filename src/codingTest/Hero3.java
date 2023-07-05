package codingTest;

import java.util.Arrays;

public class Hero3 {

	public static void main(String[] args) {
		int[] n = {-3,-2,-1,0,1,2,3};
		int answer = 0;
		int l = n.length;
		
		System.out.println(Arrays.toString(n));
		for (int a=0;a<l-2;a++) {
			for (int b=a+1;b<l-1;b++) {
				for (int i=b+1;i<l;i++) {
					
					if (n[a]+n[b]+n[i] == 0) answer++;
					
				}
			}
		}
		System.out.println(answer);
	}

}
