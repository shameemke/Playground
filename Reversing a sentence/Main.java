import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		int Str_Len=sb.length();
		 Reverse_String(sb,0,Str_Len-1);
		 
		 int strt_ix=0;
		 for(int i=0;i<Str_Len;i++)
		 {
			 if(sb.charAt(i)==' ')
			 {
				 Reverse_String(sb,strt_ix,i-1) ;
				 strt_ix=i+1;
				 
			 }
			 else if(i==(Str_Len-1))
			 {
				 Reverse_String(sb,strt_ix,i) ;
				 strt_ix=i+1;
			 }
		 }
		 System.out.println(sb);
		
		
	}
	public static void Reverse_String(StringBuilder sb,int str_ix,int fnl_ix) 
	{
		int end=fnl_ix;
		int front=str_ix;
		while(front<end)
		{
			char tmp=sb.charAt(front);
			sb.setCharAt(front, sb.charAt(end));
			sb.setCharAt(end,tmp);
			front++;
			end--;
			
		}
		
		
		
	}

}
