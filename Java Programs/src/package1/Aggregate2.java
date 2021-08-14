package package1;

import methodoverride.Aggregate1;


public class Aggregate2 {
public void print()
{
	System.out.println("Method2");
}
	public static void main(String[] args) {
		Aggregate2 ob=new Aggregate2();
		ob.print();
		Aggregate1 ob1=new Aggregate1();
		ob1.display();

	}

}