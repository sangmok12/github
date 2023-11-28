//left부터 right까지 약수가 짝수면 +, 홀수면 -


package codingTest;

public class DivisorSum {

	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		int d = 0;
		int answer = 0;
		
		for (int i=left;i<=right;i++) {
			for (int a=1;a<=i;a++) {
				if (i%a==0) {
					d ++;
				}
			}
			answer += d%2==0? i : -i;
			d = 0;
		}
		System.out.println(answer);
	}

}
