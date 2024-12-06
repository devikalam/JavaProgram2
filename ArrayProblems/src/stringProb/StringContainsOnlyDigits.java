package stringProb;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		String s="hello78";boolean flag=true;int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				
				
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("string contains only digits");
		}
		else {
			System.out.println("string contains not only digits");
		}

	}

}
