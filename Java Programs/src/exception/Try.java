package exception;

public class Try {

	public void hello() {
		try
		{
			int a=50/0;
			System.out.println(a);
			System.out.println("try access");
		} 
		catch(Exception y)
		{
			System.out.println(y);
			y.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Try ob=new Try();
		ob.hello();
		System.out.println("try");

	}

}
