package stringProb;

public class ConverFirstCharToUpperCase {

	public static void main(String[] args) {
		String s="devi";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		char c1=s.charAt(0);
		System.out.println(c1);
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==c1) {
				int n=c-32;
				System.out.print((char)n);
			}
			else {
				System.out.print(c);
			}
		}

	}

}
