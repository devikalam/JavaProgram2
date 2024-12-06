package Array;

import java.util.Arrays;

public class RevEachEleFromArray {

	public static void main(String[] args) {
		int[]a= {79,67,85,98};
		for(int i=0;i<a.length;i++){
			int n=a[i];
			int rev=0;
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			//System.out.println(rev);
			a[i]=rev;
		}
		System.out.print(Arrays.toString(a));
	}

}
