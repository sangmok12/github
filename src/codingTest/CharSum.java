package codingTest;

public class CharSum {

	public static void main(String[] args) {
		int n = 34115;
		int answer = 0;
//		String s = ""+n;
//		
//		for (int i=0;i<s.length();i++)
//			answer += Integer.parseInt(s.substring(i, i+1));
			
		
		while(n>0) {
			answer += n%10;
			n/=10;
			
			
		}
			System.out.println(answer);
			
			
		
	}
}
