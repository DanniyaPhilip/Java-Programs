package Prgm1;

public class StringEx {
	
	
	public static void main(String args[])
	{
	StringBuffer ob=new StringBuffer("hello");
	ob.append(" java");
	System.out.println(ob);
	System.out.println(ob.reverse());

	StringBuffer ob1=new StringBuffer("hello");
	ob1.replace(1,3,"java");
	System.out.println(ob1);

	StringBuffer ob2=new StringBuffer("hello");
	ob2.insert(1,"java");
	System.out.println(ob2);

	StringBuffer ob3=new StringBuffer("hello");
	ob3.delete(1,3);
	System.out.println(ob3);

	}
	}

