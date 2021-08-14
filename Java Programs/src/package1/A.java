package package1;
import package2.B;
//import package3.D;

public class A extends B{

	public static void main(String[] args) {
		A ob=new A();
	//	ob.get();   //default
		ob.set();   //public
	//	ob.wet();   //private
		ob.met();   //protected
} }
