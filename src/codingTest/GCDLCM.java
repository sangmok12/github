//최대공약수 GCD(greatest common divisor)
//최소공배수 LCM(largest common multiple)


// a*b / 최대공약수 = 최대공배수 
package codingTest;

import java.util.Arrays;

public class GCDLCM {

	public static void main(String[] args) {
		int a = 6;
		int b = 44;
		int [] answer = new int[2];
		int c = a<b ? b:a;
		
		for (int i=1;i<=c;i++) {
			if(a%i==0 && b%i==0) answer[0] = i;
		}
		for (int s=c;s<=1000000;s++) {
			if(s%a==0 && s%b==0) {
				answer[1]=s;
				break;
			}
		}
		System.out.println(Arrays.toString(answer));
		
		
	}

}
