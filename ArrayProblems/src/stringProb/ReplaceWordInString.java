package stringProb;

import java.util.Arrays;

public class ReplaceWordInString {

	public static void main(String[] args) {
	String s="java is a simple lang";
	String[]a=s.split(" ");
	for(int i=0;i<a.length;i++) {
		if(a[i].contains("simple")){
	a[i]="funny";
		}
		System.out.println(Arrays.toString(a));
		
	}

	}

}
