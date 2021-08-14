package methodoverride;


public class StudenDetails {
	
	public String address()
	{
		String a="Whitefield";
		return(a);
	}
	public void print(String n,String ad,int r)
	{
		System.out.println("Name of Student: "+n);
		System.out.println("Roll no.of Student: "+r);
		System.out.println("Address of Student: "+ad);
	}

	public static void main (String[] args) {
		StudenDetails ob=new StudenDetails();
		String a=ob.address();
		Studentname ob1=new Studentname();
		String n=ob1.name();
		int r=ob1.rollno();
		ob.print(n,a,r);
	}

}
