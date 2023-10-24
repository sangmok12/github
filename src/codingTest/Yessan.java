// 가진 예산으로 최대한 많은 부서를 지원해주기 



package codingTest;

import java.util.Arrays;

public class Yessan {

	public static void main(String[] args) {
		int[] d = {2,3,2,3};
		int budget = 10;
		Arrays.sort(d);
		
		int answer = 0;
		for(int i=0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
		System.out.println(answer);

	}

}
