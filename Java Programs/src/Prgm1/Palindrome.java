package Prgm1;

public class Palindrome {

	public void palin(String n)
    {
		
   	 int i=0, j=n.length()-1,f=1;
   	 String n1=n.toLowerCase();
   	 while(i<j && i!=j)
   	 {
   		 if(n1.charAt(i) != n1.charAt(j)) 
   		       f=0;   
   		 
   		 i++;
   		 j--;       }
   	 
   	 if(f==1)
   		 System.out.println(n+" is a Palindrome");
   	 else
   		 System.out.println(n+" is not a Palindrome");
    }
	
	public static void main(String[] args) {
		Palindrome ob=new Palindrome();
		ob.palin("Java");
		ob.palin("Malayalam");
		
}
     }
