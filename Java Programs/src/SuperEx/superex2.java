package SuperEx;

public class superex2 extends superex1 {
	int t=8;
	public superex2(int a,int b) 
	{
		super(a,b);
		super.display();
		System.out.println("Child class instance variable: " +t);
		System.out.println("Parent class instance variable: " +super.t);
		System.out.println("Returned to Child class constructor");
		
	}

	public static void main(String[] args) {
		superex2 ob=new superex2(10,20);
	

	}

}
