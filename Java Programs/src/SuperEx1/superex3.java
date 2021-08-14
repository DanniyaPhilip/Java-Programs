package SuperEx1;
import SuperEx.superex4;

public class superex3 extends superex4 {
int c;

public void calculate()
{
	c=f-g;
	System.out.println(c);
}
public static void main(String args[]) {
	superex3 ob1=new superex3();
	ob1.calculate();
}
}
