package Prgm1;

public class ThisEx {

	public static void main(String[] args) {
		ThisEx ob=new ThisEx();
		ob.add(3,2);
		

	}
public void add(int b,int c)
{
	this.sub(5,4);
	int a=b+c;
	System.out.println("Sum: "+a);
}
public void sub(int d,int e)
{
	int l=d-e;
	System.out.println("Difference: "+l);
	
}
}                  
