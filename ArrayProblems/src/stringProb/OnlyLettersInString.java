package stringProb;

public class OnlyLettersInString {

	public static void main(String[] args) {
	String s="hello78";boolean flag=true;int c=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z') {
			
			c++;
		}
		else {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("string contains only letters");
	}
	else {
		System.out.println("string contains not only letters");
	}

	}

}
