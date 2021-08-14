package exception;

public class TestException {

	public void validate(int age) throws CustomException {
		if(age<18)
		{
			throw new CustomException("Not valid");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		TestException ob=new TestException();
		try
		{
			ob.validate(13);
			}
       catch (Exception m) {
	    System.out.println("Exception occured: " +m);
}
	System.out.println("rest of the code");
	}

}
