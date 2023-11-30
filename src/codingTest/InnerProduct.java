//길이가 같은 배열의 내적 


package codingTest;

public class InnerProduct {

	public static void main(String[] args) {
		int answer = 0;
		
		int[] a = {1,2,3,4};
		int[] b = {4,3,2,1};
		
		for(int i=0;i<a.length;i++) {
			answer += a[i]*b[i];
		}
		System.out.println(answer);
		

	}

}
