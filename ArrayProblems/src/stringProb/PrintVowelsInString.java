package stringProb;

public class PrintVowelsInString {

	public static void main(String[] args) {
	String s="welcome";int c=0,v=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch);
			v++;
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(ch);
			c++;
		}
	
	}
	System.out.println("no of vowels"+v);
	System.out.println("no of consonants "+c);

	}

}
