package codingTest;

public class RollInt {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		
		//int 는 10자리까지임으로 long으로 변환
		//문제에서 문자열 p 의 자릿수가 0~18이었음. 
		long pint = Long.parseLong(p);
		long tlen = t.length();
		int plen = p.length();
		
		long r = tlen-plen;
		int cnt = 0;
		
		for (int i=0;i<=r;i++) {
			if (Long.parseLong(t.substring(i,i+plen))<=pint)
				cnt++;
		}
		
		
		
		
		System.out.println(cnt);
		System.out.println(r);
		
	}

}
