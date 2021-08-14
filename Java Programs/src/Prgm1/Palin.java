package Prgm1;

public class Palin {
	static int a=5;
	public void palind(String s)
	{
		//s=s.toLowerCase();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equalsIgnoreCase(s1)) 
			System.out.println("Palindrome");
	
		else
			System.out.println("Not Palindrome");
			
	}

	public static void main(String[] args) {
		
Palin ob=new Palin();
ob.palind("malayalam");
	}

}
