package stringProb;

public class ExcharAt {

	public static void main(String[] args) {
	String s="hello";
	System.out.println(s.length());
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(1));
	System.out.println(s.charAt(2));
	System.out.println(s.charAt(3));
	System.out.println(s.charAt(4));
	System.out.println("----using for loop--");
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	System.out.println("---toUpperCase---");
	String s1="apple@123";
	System.out.println(s1.toUpperCase());
	System.out.println("----toLowerCase---");
	String s2="APPLEsony@123";
	System.out.println(s2.toLowerCase());
	

	}

}
