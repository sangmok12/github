// 두 수의 사이 다 더하기 

package codingTest;

public class SumBetween {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int answer = 0;
		if (a < b) {
			for (int i = a ; i<=b; i++) {
				answer += i;
			}
		}
		else {
			for (int i = b; i<=a; i++) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}

}
