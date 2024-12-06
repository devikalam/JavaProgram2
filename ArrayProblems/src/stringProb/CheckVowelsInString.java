package stringProb;

public class CheckVowelsInString {

	public static void main(String[] args) {
		String s="cry";int c=0;boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!='a'||ch!='e'|| ch!='i' || ch!='o' || ch!='u') {
				flag=true;
				break;
			
			}
		}
		if(flag==true) {
			System.out.println("vowels present");
		}
			else {
				System.out.println("vowels not present");
			}
	}

}
