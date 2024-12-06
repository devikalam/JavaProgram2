package stringProb;

public class LargestWordInGivenString {

	public static void main(String[] args) {
		String s="hello hi welcome bi";
		String[]a=s.split(" ");
		String max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
			}
		}
	
System.out.println("largest word: "+max);
	}

}
