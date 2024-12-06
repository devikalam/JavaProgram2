package Array;
import java.util.Arrays;
public class ToPrintEvenEle {

	public static void main(String[] args) {
		int[]a= {1,2,4,6,7,8,9};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
