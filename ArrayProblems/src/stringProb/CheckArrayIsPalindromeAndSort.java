package stringProb;

public class CheckArrayIsPalindromeAndSort {

	public static void main(String[] args) {
     int[]a= {1,2,3,4,3,2,1};
     int l=0,r=a.length-1;boolean flag=false;
     while(l<=r) {
    	 int mid=(l+r)/2;
    	 for(int i=1;i<a.length/2;i++) {
    	 if(a[0]==a[a.length-1]){
    		 flag=true;
    		 break;
    	 }
    	 else if(a[mid]>1) {
    		 l=mid+1;
    	 }
    	 else  if(a[mid]<1){
    		 l=mid-1;
    	 }
    	
     }
    	 if(flag==true) {
    		 System.out.println("palindrome");
    		 break;
    	 }
    	 else {
    		 System.out.println("not palindrome");
    	 }
	
     }

	}

}
