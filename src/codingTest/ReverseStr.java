//문자열 큰순부터 작은순으로 전체 대문자는 전체 소문자보다 더 작음. 

package codingTest;

import java.util.Arrays;

public class ReverseStr {

	public static void main(String[] args) {
		String s = "isejfSs";
		String[] list = String.valueOf(s).split("");
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		StringBuilder sb = new StringBuilder();
		for (String aList : list) sb.append(aList);
		sb = sb.reverse();
		String a = sb.toString();
		System.out.println(a);
		

	}

}
