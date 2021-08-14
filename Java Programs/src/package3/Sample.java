package package3;

import abstractex1.Test;

public class Sample extends Test{
	public static void main(String[] args) {
		Sample ob=new Sample();
		ob.hello();
		ob.print();
		}
		public void hello() 
		{
			System.out.println("Abstract method in abstract class defined in extended class");
		}
}
