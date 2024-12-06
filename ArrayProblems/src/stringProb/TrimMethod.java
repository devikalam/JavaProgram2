package stringProb;

public class TrimMethod {

	public static void main(String[] args) {
String s="   goo d  morning   ";
System.out.println("----using trim()----");
System.out.println(s.trim());
System.out.println("---without using trim()-----");
int st=0,en=s.length()-1;
for(int i=0;i<s.length();i++) {
	if(s.charAt(st)==' ') {
		st++;
	}
	else if(s.charAt(en)==' ') {
		en--;
	}
}
for(int i=st;i<=en;i++) {
	System.out.print(s.charAt(i));
}

	}

}
