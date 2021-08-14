package Progrms;
import java.util.Scanner;
public class PalinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
String s=sc.next();
PalinString ob=new PalinString();
String h=ob.palin(s);
System.out.println(h);
	}
public String palin (String s)
{
	String str="";
	for(int i=s.length()-1;i>=0;i--)
	{
	str=str+s.charAt(i);	
	}
	if(str.equalsIgnoreCase(s))
		return "Yes";
	else
		return "No";
}

}
