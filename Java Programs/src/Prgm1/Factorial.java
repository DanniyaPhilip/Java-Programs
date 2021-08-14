package Prgm1;

public class Factorial {
	public int fact(int n)
	{ int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
public void print() {
	int f1=this.fact(7);
	System.out.println("Factorial:"+f1);
}
public static void main (String args[]) {
	Factorial ob=new Factorial();
	ob.print();
}
}
