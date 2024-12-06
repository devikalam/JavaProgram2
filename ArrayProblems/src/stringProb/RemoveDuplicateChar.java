
package stringProb;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
	String s="programming";
	char[]a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		int c=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				c++;
				a[j]=Character.MAX_VALUE;
				
			}
		}
		if(a[i]!=Character.MAX_VALUE && c==1) {
			System.out.println(a[i]+"->"+c);
		}
		
	}

	}

}
