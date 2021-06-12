import java.util.Scanner;
 class Main{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	int StrBLen=str.length();
    	
    	int front=0;
    	int end=str.length()-1;
    	boolean Is_Palindrome=true;
    	
    	while (front<end ) {
    		if(str.charAt(front)!=str.charAt(end)) {
    			Is_Palindrome=false;
    			break;
    		}
    		front++;
    		end--;
    		
    		
    	}
    	if(Is_Palindrome==true) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    		
    	}
			
    }
}
