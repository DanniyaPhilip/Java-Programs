package MultipleInheritance;


public class Addition extends Multiplication{

	
		// 
		public void add()
		{
			int c=a+b;
			System.out.println("Sum: "+c);
		}

		public static void main(String[] args) {
			Addition ob=new Addition();
			ob.display();
			ob.multiply();
			ob.add();
		

		}

	}


