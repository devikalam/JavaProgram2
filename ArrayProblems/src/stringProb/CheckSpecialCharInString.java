package stringProb;

public class CheckSpecialCharInString {

	public static void main(String[] args) {
String s="#";
boolean flag=true;
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' || ch>=0 && ch<=9) {
		flag=false;
		break;
	}
}
if(flag==true) {
	System.out.println("string contains special char");
}
else {
	System.out.println("string not only contains special char");
}

	}

}
