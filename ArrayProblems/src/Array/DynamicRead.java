package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicRead {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
	int[]a=new int[size];
	System.out.println("enter array ele");
	
	for(int i=0;i<a.length;i++) {
		
		a[i]=s.nextInt();
	}
	System.out.println("array ele are");
	System.out.println("using to string()");
	System.out.println(Arrays.toString(a));
	System.out.println("using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
			}
		
	}

	}


