package Array;

public class AvgOfEvenEle {

	public static void main(String[] args) {
		int[]a= {10,5,6,7,11,12,14};
		int sum=0,c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
		c++;
			}
		}
		System.out.println("avg:"+(sum/c));

	}

}
