package interfaceex;

public class XYZ extends ABC{

	public void hey() {
		System.out.println("Abstract method hey of abstract class");
	}
	public void hello() {
		System.out.println("Abstract method hello of interface Test");
	}
	
	public static void main(String[] args) {
		Test ob= new XYZ();
		ob.hello();
		ABC ob1=new XYZ();
		ob1.hey();
		System.out.println("Abstract variable of Interface Test is " +ob.a);
		

	}

}
