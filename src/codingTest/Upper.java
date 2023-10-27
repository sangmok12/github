// 단어의 첫 글자만 대문자로 


package codingTest;

public class Upper {

	public static void main(String[] args) {
		String s = "eowef seFeivs dvsE";
		   StringBuilder sb = new StringBuilder(s.toLowerCase());
		    
		    // 첫 글자 대문자로 변경
		    if (sb.length() > 0) {
		        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		    }

		    // 공백 뒤의 첫 글자들 대문자로 변경
		    for (int i = 0; i < sb.length() - 1; i++) {
		        if (sb.charAt(i) == ' ') {
		            sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
		        }
		    }
		   
		    s = sb.toString();
		
		System.out.println(s);
		
		
	}

}
