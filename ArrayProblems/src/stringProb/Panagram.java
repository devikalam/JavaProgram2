package stringProb;

import java.util.Arrays;

public class Panagram {

	public static void main(String[] args) {
		String s="aabbabcdefghijklmnopqrstuvwxyz";
		char[]a=s.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]='%';
				}
			}
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				c++;
			}
		}
		System.out.println("count: "+c);
		if(c==26) {
			System.out.println("panagram");
		}
		else
			System.out.println("not a panagram");

	}

}
