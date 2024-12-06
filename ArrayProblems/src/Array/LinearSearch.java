package Array;

public class LinearSearch {

	public static void main(String[] args) {
int[]a= {50,60,67,85,89};
int ele=100;boolean flag=false;
for(int i=0;i<a.length;i++) {
	if(a[i]==ele) {
		flag=true;
		
		break;
	}
	
}
if(flag==true) {
	System.out.println("ele found");
}
else {
	System.out.println("ele not found");
}
	}

}
