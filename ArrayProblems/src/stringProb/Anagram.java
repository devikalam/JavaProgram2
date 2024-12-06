package stringProb;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String s1="heart";
	String s2="earth";
	char[]a=s1.toCharArray();
	char[]b=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	String s3 = new String(a);
	String s4 = new String(b);
	if(s3.equals(s4)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}
	

	}

}
