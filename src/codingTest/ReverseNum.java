package codingTest;

import java.util.Arrays;

public class ReverseNum {

	public static void main(String[] args) {
		long n = 235346346;
		
		String num = ""+n;
		
		
		
		
		int[] answer = new int[num.length()];
		for (int i=0; i<num.length();i++) {
			answer[num.length()-1-i] = Character.getNumericValue(num.charAt(i));
		}
		
		
		//문자열을 뒤집는 메소드 
		StringBuilder numb = new StringBuilder(num);
		numb = numb.reverse();
		System.out.println(numb);
		
		
        System.out.println(Arrays.toString(answer));
	}

}
