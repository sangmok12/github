//공백으로 나누고 첫글자부터 홀짝홀짝 대소문자



package codingTest;


public class OddStr {

	public static void main(String[] args) {
		String s = "sefSFASssin  osasefi edxl  ";
		String answer = "";
		
		
		// 스플릿함수 뒤에 -1을 붙여주면 마지막 공백을 살려줌 
		String[] words = s.split(" ",-1);
		
		for (int i=0;i<words.length;i++) {
			char[] chars = words[i].toCharArray();
			for (int n=0;n<words[i].length();n++) {
				if(n%2==0) chars[n] = Character.toUpperCase(chars[n]);
				else chars[n] = Character.toLowerCase(chars[n]);
			}
			answer += new String(chars) + " ";
		}
		
		answer = answer.substring(0,answer.length()-1);
		System.out.println(answer);
		
	}

}
