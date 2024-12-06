package stringProb;

public class LargestCharFromSmallestWordInGivenString {

	public static void main(String[] args) {
		String s="java python html css";
		String[]a=s.split(" ");
		String min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
	System.out.println(min);
char[]a1=min.toCharArray();
char max=a1[0];
for(int i=0;i<a.length;i++) {
	if(a1[i]>max) {
		max=a1[i];
		break;
	}
}
System.out.println(max);
}

}
