package Prgm1;

public class Average1 {

	public static void main(String[] args) {
		Average1 ob=new Average1();
		ob.average(3,8,12);
		ob.average(2.5f,9.0f,4.6f);

	}
public void average(int a,int b,int c)
{
	int av=(a+b+c)/3;
	System.out.println("Average of Integer inputs: "+av);
	
}
public void average(float d,float e,float f)
{
	float av=(d+e+f)/3;
	System.out.println("Average of Floating point inputs: "+av);
}
}
