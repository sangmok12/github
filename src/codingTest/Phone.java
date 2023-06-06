//폰번호 뒷 네자리만 공개하기 

package codingTest;

public class Phone {

	public static void main(String[] args) {
		String phone = "91394135";
		String answer = "";
		
		for(int i=0;i<phone.length()-4;i++) {
			answer += "*";
		}
		answer += phone.substring(phone.length()-4);
		System.out.println(answer);
	}

}
