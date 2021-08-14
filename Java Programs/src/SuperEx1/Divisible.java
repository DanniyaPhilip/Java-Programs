package SuperEx1;

public class Divisible extends Addition{
	
	public void div( )
	{
		int n=super.add(20, 50);
		if(n%10==0)
			System.out.println("Number is divisible by 10");
		else
			System.out.println("Number is not divisible by 10");
	}

	public static void main(String[] args) {
		Divisible ob=new Divisible();
		ob.div();

	}

}
