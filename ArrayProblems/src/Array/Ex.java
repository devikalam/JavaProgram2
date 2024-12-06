package Array;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
	int[]a= {10,20,30};
	int[]b=new int[a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
System.out.println(Arrays.toString(b));
	}

}
