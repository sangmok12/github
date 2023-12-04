package codingTest;

import java.util.Arrays;

public class Banana {

	public static void main(String[] args) {
		String s = "banana";
		int [] answer = new int[s.length()];
		
		answer[0] = -1;
		
		
		for (int i=s.length()-1;i>0;i--) {
			answer[i] = -1;
			int index = i-1;
			while (index >=0) {
				if(s.charAt(i)==s.charAt(index)) {
					answer[i]= i-index;
					break;
				} else index--;
				
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(Arrays.toString(answer));
		
		
	}

}
