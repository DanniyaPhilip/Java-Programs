package Prgm1;
import java.util.Scanner;
public class Marklist {
	//static int total;
	static float p;
	public Marklist(String a) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter mark of "+a+" in Maths:");
		int m=in.nextInt();
		System.out.println("Enter mark of "+a+" in Physics:");
		int ph=in.nextInt();
		System.out.println("Enter mark of "+a+" in Chemistry:");
		int c=in.nextInt();
		int total=m+ph+c;
		System.out.println("Total Mark of "+a+":"+total);
		p=(total*100)/300;
	}

	public static void main(String[] args) {
		Marklist ob=new Marklist("Roshan");
		ob.grade("Roshan",p);
		System.out.println();
		Marklist ob1=new Marklist("Diya");
		ob1.grade("Diya",p);
	}
		
		public static void grade(String n,float p) 
		{
			if(p<40)
			System.out.println("Grade of "+n+" is F");
			else if(p<=60  && p>=40)
			System.out.println("Grade of "+n+" is E");
			else if(p<=70  && p>=61)
			System.out.println("Grade of "+n+" is C");
			else if(p<=80  && p>=71)
			System.out.println("Grade of "+n+" is B");
			else
			System.out.println("Grade of "+n+" is A");
		}	
		
}


