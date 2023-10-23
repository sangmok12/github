package codingTest;

import java.util.Arrays;

public class ReverseNum3 {

	public static void main(String[] args) {
		long n = 1319135;
		long answer = 0;
		
		// 정수 n을 문자열로 변환한 후 각 자릿수를 배열에 담는다.
		String[] list = String.valueOf(n).split("");

		// 배열을 오름차순으로 정렬한다.
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

		// 정렬된 배열을 다시 하나의 문자열로 합친다.
		StringBuilder sb = new StringBuilder();
		for (String aList : list) sb.append(aList);

		// 문자열을 뒤집은 후 다시 정수로 변환한다.
		answer = Long.parseLong(sb.reverse().toString());
		
		System.out.println(answer);
	}

}
