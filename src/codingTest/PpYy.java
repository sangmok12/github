package codingTest;

public class PpYy {

	public static void main(String[] args) {
		String s = "pPoooyY";
		int a = 0;
		int b = 0;
		for ( int i=0;i<s.length();i++) {
			if (s.charAt(i)=='p' || s.charAt(i)=='P') {
				a++;
			}
			else if (s.charAt(i)=='y' || s.charAt(i)=='Y') {
				b++;
			}
		}
		
		
		System.out.println(a==b? "true":"false");
		
		//boolean answer = true; 라면 
		//answer = a==b;    형식으로 표현 
	}
}


//		s = s.toLowerCase();
//		int count = 0;
//		
//		for (int i = 0; i < s.length(); i++) {
//		
//		    if (s.charAt(i) == 'p')
//		        count++;
//		    else if (s.charAt(i) == 'y')
//		        count--;
//		}
//		
//		if (count == 0)
//		    return true;
//		else
//		    return false;



