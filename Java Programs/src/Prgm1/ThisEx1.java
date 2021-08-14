package Prgm1;

public class ThisEx1 {

	public static void main(String[] args) {
		ThisEx1 ob=new ThisEx1();
		ob.print2();
}
	public void print2()
	{
		System.out.println("Statement number 2");
		this.print3();
	}
	public void print3()
	{
		System.out.println("Statement number 3");
		this.print1();
	}
	public void print1()
	{
		System.out.println("Statement number 1");
	
	}

}
