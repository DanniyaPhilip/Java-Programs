package Prgm1;

public class Area1 {

	public static void main(String[] args) {
Area1.area(5);
Area1.area(16,4);
Area1.area(13,7,0.5);
	}
	public static void area(int s)
	{
		int a=s*s;
		System.out.println("Area of Square: " +a);
	}
	public static void area(int l,int b)
	{
		int a=l*b;
		System.out.println("Area of Rectangle: " +a);
	}
	public static void area(int h,int b,double r)
	{
		double a=(float)h*b*r;
		System.out.println("Area of Triangle: " +a);
	}
}
