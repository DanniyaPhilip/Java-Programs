package Prgm1;

public class ThisEx3 {
String name;
	public static void main(String[] args) {
		ThisEx3 ob= new ThisEx3("Example");
		ob.display();
}
	public ThisEx3(String name)
	{
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	

}
}