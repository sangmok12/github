//���� ����� ������ ���� ����� �Ⱦ��� ��, ���� �� �ִ� �ִ� ������ ����ϰ��� �մϴ�.(����� ���� �����θ� �Ǹ��ϸ�, ���� ����� �����ϴ�)


package codingTest;

import java.util.Arrays;

public class AppleBox {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int temp = 0;
		int answer = 0;
		
		
		int[] score = {4,1,2,2,4,4,4,4,1,2,4,2,1};
		
		for (int i=0;i<score.length-1;i++) {
			for ( int j=i+1;j<score.length;j++) {
				
				if (score[i] > score[j]) {
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(score));
		
		int n = score.length%m;
		
		int[] nscore = new int[score.length-n];
		
		for (int ns=0;ns<nscore.length; ns++) {
			nscore[ns] += score[n+ns];
		}
		
		System.out.println(Arrays.toString(nscore));
		
		int a=0;
		while (a < nscore.length) {
		   answer += nscore[a]*m;
		    
		    a += m; 
		}
		
		
		System.out.println(answer);
		
		
	}

}
