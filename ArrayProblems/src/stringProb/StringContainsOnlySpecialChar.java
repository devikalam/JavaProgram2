package stringProb;

public class StringContainsOnlySpecialChar {

	public static void main(String[] args) {
		String s="tom89123";
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' || ch>=0 && ch<=9)
			{
			
			}
			else {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("string contains special char");
		}
		else {
			System.out.println("string not contains special char");
		}

	}






}
