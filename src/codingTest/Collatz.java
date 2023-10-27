//콜라츠 함수 
//입력된 수가 짝수라면 2로 나눈다.
//입력된 수가 홀수라면 3을 곱하고 1을 더한다.
//결과 값 1이  나올 때 까지 반복
//500번 반복해도 안되면 -1 반



package codingTest;

public class Collatz {

	public static void main(String[] args) {
		long n = 626331;   //int 타입으로는 불가능 
		
		int answer = 0;
		while (n != 1) {
		    System.out.println(n);  // 디버깅용 출력
		    if (n % 2 == 0) {
		        n /= 2;
		    } else {
		        n = n * 3 + 1;
		    }

		    answer++;

		    if (answer > 500) {
		        answer = -1;
		        break;
		    }
		}

		System.out.println(n);  // 디버깅용 출력
		
		System.out.println(answer);
	}

}


//		1등 풀이 
//		
//		long n = (long)num;
//		for(int i=0; i<500; i++){
//		    if(n==1) return i; 
//		  n = (n%2==0) ? n/2 : n*3+1;
//		}
//		
//		    return -1;
//		}

