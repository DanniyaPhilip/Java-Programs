package Prgm1;
import java.util.Scanner;
public class Onseason extends Offseason {
	public void discount(float total) 
	{
	float amount=(40*total)/100;
	System.out.println("Total amount after discount: "+amount);
	}
	public void extension(float total)
	{
		super.discount(total);
	}

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter season");
    String season=s.nextLine();
    System.out.println("Enter Total amount");
    float total=s.nextFloat();
    Onseason ob=new Onseason();
    if(season.equalsIgnoreCase("Onseason"))
    	ob.discount(total);
    else 
    	ob.extension(total);
	}

}
