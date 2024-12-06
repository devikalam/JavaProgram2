package Array;

import java.util.Arrays;

public class InsertTwoEle {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int[]b=new int[a.length+2];
		int ele1=30,index1=5;
		int ele2=60,index2=2;int j=0;
		if(index1<b.length&& index2<b.length) {
			for(int i=0;i<b.length;i++) {
				if(i==index1) {
					b[i]=ele1;
				System.out.println();
				}
				else if(i==index2){
	               b[i]=ele2;
				}
				else {
					b[i]=a[j];
					j++;
				}
			}
			System.out.println(Arrays.toString(b));
		}
		//for printing the message if index is greater than 8
		else {
			System.out.println("index should be less than:"+b.length);
		}

	}

}
