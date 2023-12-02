//시저암호 알파벳에 + n 씩 올리기 z,Z 넘으면 다시 앞으로


package codingTest;

public class CaesarCipher {

	public static void main(String[] args) {
		String s = "z";
		int n = 1;
		int as = 0;
		String answer = "";

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				as = s.charAt(i);
				
				if (65 <= as && as <= 90 ) {
					as += n;
					if (as > 90 ) as -= 26;
				} else if (97 <= as && as <= 122) {
					as += n;
					if (as > 122 ) as -= 26;
				}
			} else if(s.charAt(i) == ' ') {
				as = s.charAt(i);
			}
			answer += (char)as;
		}
		
		System.out.println(as);
		 
		 
		
	}

}
