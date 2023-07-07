package codingTest;

import java.util.Arrays;

public class MaxInt {

	public static void main(String[] args) {
		
		int[] numbers = {1,5,3,66,15};
		int n = numbers.length;
		Arrays.sort(numbers);
		int answer = numbers[n-1]*numbers[n-2];
		System.out.println(answer);
	}

}
