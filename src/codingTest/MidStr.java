//중간글자 구하기 짝수라면 가운데 두글자

package codingTest;

public class MidStr {

	public static void main(String[] args) {
		String a = "ixnddvdl";
		int alen = a.length();
		if (alen % 2 == 1) {
			a = a.substring(alen/2,alen/2+1);
		}
		else {
			a = a.substring(alen/2-1,alen/2+1);
		}
		System.out.println(a);

	}

}
