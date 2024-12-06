package stringProb;

import java.util.Arrays;

public class BubblesortEx {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		for(int i=0;i<a.length-1;i++) {
			int flag=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]==a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}}
		for(int i=0;i<a.length;i++) {
			
		System.out.println(a[i]);
		}

	}

}
