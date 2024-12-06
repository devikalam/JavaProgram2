package stringProb;

public class SmallestWord {

	public static void main(String[] args) {
		String s="hello hi welcome  bi";
		String[]a=s.split(" ");
		String min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
	
System.out.println("smallest word: "+min);
	}

}
