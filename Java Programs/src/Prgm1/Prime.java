package Prgm1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count");
		int count=sc.nextInt();
		System.out.println(2);
		int n=3,f=0,c=1;
		//while(c<=count)
		//{
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
			{
			f=1;
			System.out.println(n);
			
			}
			n=n+1;
		}

		/*if(f==0) {
			//System.out.println(n);
			//c=c+1;
		}
		n=n+1; */
		//}
}
}