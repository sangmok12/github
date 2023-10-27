// 배열의 곱 최소값 찾기 
package codingTest;

import java.util.Arrays;

public class ArrayMin {

	public static void main(String[] args) {
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int answer = 0;
		for (int i=0; i<a.length; i++) {
			answer += a[i]*b[a.length-1-i];
		}
		System.out.println(answer);
		
		
		
		
	}

}
