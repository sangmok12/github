// 0 ~ 9 까지 없는 숫자 더하기 
package codingTest;


public class NonSum {

	public static void main(String[] args) {
		int[] a = {1,2,4,0};
		int answer = 45;
		for (int i=0;i<a.length;i++) {
			for (int ii=0;ii<10;ii++) {
				if(a[i]==ii) answer -= a[i];
			}
		}
		System.out.println(answer);
	}
}


		//좋은 답안
		//
		//int sum = 45;
		//for (int i : numbers) {
		//    sum -= i;
		//}
		//return sum;
