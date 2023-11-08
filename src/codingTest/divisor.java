//주어진 수 d 로 나눠지는 배열만 순서대로 배열, 없으면 -1
package codingTest;

import java.util.Arrays;

public class divisor {

	public static void main(String[] args) {
        int[] a = {2, 5, 9, 7, 10};
        int d = 7;

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int count = 0;
        for (int i : a) {
            if (i % d == 0) {
                count++;
            }
        }
        int[] answer;
        if (count == 0) {
        	answer = new int[]{-1};
        } else {
        	answer = new int[count];
            int resultIndex = 0;

            for (int i : a) {
                if (i % d == 0) {
                    answer[resultIndex] = i;
                    resultIndex++;
                }
            }
        }
        

        System.out.println(Arrays.toString(answer));
    }

}
