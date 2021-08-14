package methodoverride;

public class OverrideEx2 extends OverrideEX1 {
	@Override
	public void get(int d)
	{
		System.out.println("Child");
		int c=b-a;
		System.out.println("Difference: "+c);
		System.out.println(d);
	}
	public static void main(String args[])
	{
		
		OverrideEx2 ob=new OverrideEx2();
		ob.get(16);
		
	}
}
