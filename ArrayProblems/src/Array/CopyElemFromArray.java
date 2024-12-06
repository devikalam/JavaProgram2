package Array;

public class CopyElemFromArray {

	public static void main(String[] args) {
int []a= {1,2,3,4,5,6};
int []b= new int[a.length+2];
int j=0;int index1=5;int index2=2,ele1=60;
if(index1<b.length) {
for(int i=0;i<b.length;i++) {
	if(i==index1) {
		b[i]=ele1;
	}
		
	}
}

	}

}
