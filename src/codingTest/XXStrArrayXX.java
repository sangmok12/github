//n번째 알파벳을 기준으로 정렬하기


package codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class XXStrArrayXX {

	public static void main(String[] args) {
		String[] s = {"sun","auw","uuu","bed","car","izj","azw"};
		int n = 1;
		String temp = "";
		String[] t = new String[s.length];
		String[] t2 = new String[s.length];

		for (int i=0;i<s.length;i++) {
			t[i] = String.valueOf(s[i].charAt(n)) + i;
		}
		
		Arrays.sort(t);
		
		for (int j=0;j<s.length;j++) {
			t2[j] = s[Integer.parseInt(t[j].substring(1))];
		}
		
		
		int index = 0;
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		for (int k=0;k<s.length-1;k++) {
			index++;
			if(t2[k].charAt(n) == t2[k+1].charAt(n)) {
				set.add(t2[k]+","+index);
				set.add(t2[k+1]+","+(index+1));
			} else {
				list = new ArrayList<>(set);
			}
			
		}
		System.out.println(index);
//		List<String> list = new ArrayList<>(set);
		String[] size = list.toArray(new String[0]);
		
		
		System.out.println(Arrays.toString(size));
		
		System.out.println(set);
		System.out.println(Arrays.toString(t2));
		
	
	}
		
		
		
	

}
