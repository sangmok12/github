package codingTest;

import java.util.Arrays;

public class ReverseNum2 {

	public static void main(String[] args) {
		long n = 1319135;
		
		
		String num = ""+n;
		long[] n1 = new long[num.length()];
		
		int cnt=0;
		while (n>0) {
			n1[cnt] = n%10;
			n/=10;
			cnt++;
		}
		
		Arrays.sort(n1);
		
		String a = "";
		for(int i=0;i<n1.length;i++) {
			 a += Long.toString(n1[i]);
		}
		
		System.out.println(a);
		StringBuilder numb = new StringBuilder(a);
		numb = numb.reverse();
		
		
		long answer = Long.parseLong(numb.toString());
		
		System.out.println(Arrays.toString(n1));
		System.out.println(answer);
	}

}
