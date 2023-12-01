package codingTest;


public class ArrSum {

	public static void main(String[] args) {
		int[][] a = {{1,2},{2,3}};
		int[][] b = {{3,4},{5,6}};
		
		int alen = a.length;
		
		int[][] sum = new int[alen][a[0].length];
		
		for (int i=0;i<alen;i++) {
			for (int s=0;s<a[i].length;s++) {
				sum[i][s] = a[i][s] + b[i][s];
				System.out.println(sum[i][s]);
				System.out.println(alen);
			}
		}
		
		
		
		
	}

}
