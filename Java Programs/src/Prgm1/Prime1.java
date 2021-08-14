package Prgm1;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		System.out.println("Enter");
Scanner sc=new Scanner(System.in);
int count=sc.nextInt();
System.out.println(count);
int c=1, n=3,i;
while(c<=count)
{
	for(i=2;i<n;i++)
	{
		System.out.println("value of i"+i);
	
		System.out.println("value of n"+n);
	}
	n++;
	System.out.println("count"+c);
	c++;


}
	}
}
