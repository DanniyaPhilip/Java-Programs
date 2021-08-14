package MultilevelInheritance;

class Rectangle extends Square {
	 void area1() 
	 {
		int a=l*b;
		System.out.println("Area of Rectangle: "+a);
	}
public static void main(String arg[]) 
{
	Rectangle ob=new Rectangle();
	ob.display();
	ob.area();
	ob.area1();
	
	
}
}
