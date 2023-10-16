package codingTest;

import java.util.Arrays;

public class ReverseNum3 {

	public static void main(String[] args) {
		long n = 1319135;
		long answer = 0;
		
		String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        answer =  Long.parseLong(sb.reverse().toString());
		
		System.out.println(answer);
		System.out.println(Arrays.toString(list));
	}

}
