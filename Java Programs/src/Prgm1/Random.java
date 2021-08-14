package Prgm1;

public class Random {
	int a=80;
	static int g=6;
	public int display()
	{
		this.print();
		String s="new";
		s="the";
		String s1=s.concat("example");
		System.out.println(s1);
		System.out.println(a);
		System.out.println(g);
		return a;
	}
	public void print() {
	
		System.out.println(a);
		System.out.println(g);	
	}
public static void main(String args[])
{
	Random ob=new Random();
	int k=ob.display();
	System.out.println(k);
	//System.out.println(a);
}
}
