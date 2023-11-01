// true일땐 + , false 일땐 - 값 더하기


package codingTest;

public class PlusMinus {

	public static void main(String[] args) {
		int []a = {4,7,12};
		boolean[]b= {true,false,true};
		
		int answer = 0;
		for (int i=0;i<a.length;i++) {
			if (b[i]==false) {
				answer = answer + a[i]*-1;
			}else if (b[i]==true) {
				answer = answer + a[i];
			}
			
			
			//모범답
			// answer += a[i] * (b[i]? 1: -1);
		}
		
		System.out.println(answer);
	}

}


