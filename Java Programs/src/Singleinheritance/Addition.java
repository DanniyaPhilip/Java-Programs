package Singleinheritance;

public class Addition extends Values {
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Addition ob=new Addition();
		ob.display();
		ob.add();
	

	}

}
