package stringProb;

public class Problem1{

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
		String s3="java";
		String s4=new String("java");
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println("---equals method---");
		String a="java";
		String b="javA";
System.out.println(s2.equals(s4));
System.out.println("--equalsIgnoreCase---");
String s="Level";
String rev="leveL";
System.out.println(s.equalsIgnoreCase(rev));

	}

}
