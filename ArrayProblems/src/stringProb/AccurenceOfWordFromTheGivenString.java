package stringProb;

public class AccurenceOfWordFromTheGivenString {

	public static void main(String[] args) {
		String s="hello bye hi hello welcome";
		String[]a=s.split(" ");
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					c++;
					a[j]=" ";

				}
			}
			if(a[i]!=" ") {
				System.out.println(a[i]+"->"+c);
			}
		}
	}


}


