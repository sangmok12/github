//자연수 n 이 정수 x 의 제곱이면, x+1의 제곱, 아니면 -1을 반환하여라 




package codingTest;

public class Sqrt {

	public static void main(String[] args) {
		long n = 121;
		
		
		long answer = 0;
		long x = (long) Math.sqrt(n);
		if (n/x == x && n%x ==0) 
			answer = (x+1)*(x+1);
		else answer = -1;
		System.out.println(answer);

		
		//거듭 제곱 하는 방법이다 (곱하려는 수 , 몇제곱할지 )
		// 이 방법으로도 제곱근을 구할 수 있다. 
		long x2 = (long) Math.pow(n,0.5);
		System.out.println(x2);

	}

}
