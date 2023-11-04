//문자열이 4 또는 6이면서 숫자로만 이루어지면 True


package codingTest;

public class CleanStr {

	public static void main(String[] args) {
		
		boolean answer = true;
		
		String a = "123s34";
		int len = a.length();
		if (len==4 || len==6 ) {
			for (char c : a.toCharArray()) {
				if (c >= '0' && c <= '9') {
					
				} else {
					answer = false;
					break;
				}
			
			
			}
		} else answer = false;
		
		System.out.println(answer);
	}

}
