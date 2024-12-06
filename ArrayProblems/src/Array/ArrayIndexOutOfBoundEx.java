package Array;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		int c=0;
		for(int i=-5;i<=5;i++) {
			if(i>=0&&i%2==0) {
				c++;
			}
		}
System.out.println(c);
for(int i=-5;i<=5;i++) {
	int pow=1;
	for(int j=1;j<=c;j++) {
		if(i>=0&& i%2==0) {
		pow=pow*i;
		}
	}
	if(i>=0&&i%2==0) {
	System.out.println(i+"->"+pow);
	}
}

	}

}
