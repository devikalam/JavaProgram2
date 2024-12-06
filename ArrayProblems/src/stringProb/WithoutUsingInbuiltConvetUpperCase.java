package stringProb;

public class WithoutUsingInbuiltConvetUpperCase {

	public static void main(String[] args) {
		String s="apple@123";
		System.out.println(s.toUpperCase());
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			//System.out.println(ch);
			if(ch>='a' && ch<='z') {
				
				int n=ch-32;
				//System.out.println(n);
				System.out.print((char)n);
			}
			else {
				System.out.print(ch);
			}
		}

	}

}
