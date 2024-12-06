package stringProb;

public class CountSpacesInString {

	public static void main(String[] args) {
	String s="g o o d";
	int count=0;
 for(int i=0;i<s.length();i++) {
	 int ch=s.charAt(i);
	 if(ch==' ') {
		 count++;
	 }
 }
 System.out.println(count);
	}

}
