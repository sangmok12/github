//공백으로 나눠진 숫자 최대값 최소값 반환 



package codingTest;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		String[] parts = s.split(" ");
		int[] as = new int[parts.length];

		for (int i = 0; i < parts.length; i++) {
		    as[i] = Integer.parseInt(parts[i]);
		}

		Arrays.sort(as);

		int len = as.length;
		
		System.out.println(as[0]+" "+as[len-1]);

	}

}
