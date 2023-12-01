//배열에서 연속 된 수 빼기 



package codingTest;

import java.util.Arrays;

public class Overlap {

	public static void main(String[] args) {
		int []arr = {1,1,4,2,2,4,4,0};
		
		int cnt = 0;
		int len = arr.length;
		
		
		for (int i=1;i<len;i++) {
			if(arr[i] == arr[i-1]) cnt++;
		}
		
		int nlen = len - cnt;
		int[]answer = new int[nlen];
		answer[0] += arr[0];
		
		int index = 1;
		for (int s=1;s<len;s++) {
			if(arr[s] != arr[s-1]) {
				answer[index++] = arr[s];
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
