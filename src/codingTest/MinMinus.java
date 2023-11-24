//가장 작은 수 빼기
package codingTest;


public class MinMinus {

	public static void main(String[] args) {
		int[] a = {4,3,2,1};
		
		
		if (a.length == 1) {
			a[1] = -1;
		}
		else {
			int minIndex = 0;
			for (int i = 1; i < a.length; i++) {
			    if (a[i] < a[minIndex]) {
			        minIndex = i;
			    }
			}

			// 가장 작은 수를 빼고 새로운 배열 생성
			int[] newa = new int[a.length - 1];
			for (int i = 0, j = 0; i < a.length; i++) {
			    if (i != minIndex) {
			        newa[j++] = a[i];
			    }
			}
			a = newa;
		}

	}

}
