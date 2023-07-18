package codingTest;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int[] sides = {1,2,3};
		
		Arrays.sort(sides);
		int answer = sides[0]+sides[1]>sides[2] ? 1:2;
		
		System.out.println(answer);
		
		
	}

}
