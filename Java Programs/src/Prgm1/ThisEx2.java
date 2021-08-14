package Prgm1;

public class ThisEx2 {

	public static void main(String[] args) {
		ThisEx2 ob=new ThisEx2();

	}
	public ThisEx2() {
		this("Constructor with String arg");
		System.out.println("Default Contructor");
	}
	public ThisEx2(String n) {
		this(9);
		System.out.println(n);
	}
	public ThisEx2(int a) {
		System.out.println("Integer value: "+a);
		
	}

}
