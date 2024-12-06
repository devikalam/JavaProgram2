package stringProb;

import java.util.Arrays;

public class ExForToCharArray {

	public static void main(String[] args) {
		String s="hello";
		/*char[]a=s.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println("-----without Inbuilt()");
		String s1="welcome";*/
char[]b=new char[s.length()];
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	b[i]=ch;
	//System.out.println(b[i]);
}
System.out.println(Arrays.toString(b));
	}

}
