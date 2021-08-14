package ListEx;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
	 ArrayList<Integer>a1=new ArrayList<Integer>();
	 a1.add(20);
	 a1.add(30);
	 a1.add(40);
System.out.println("Values added " +a1);
for(Integer i:a1)
	System.out.println("Value added in advanced for loop " +i);
int a=a1.remove(2);
System.out.println("Value removed is "+a);
System.out.println("New Array list: " +a1);

int s=a1.size();
System.out.println("Size is " +s);

System.out.println("Boolean is returned "+a1.add(60));
System.out.println("Array with new value added " +a1);

List<Integer> a2=new ArrayList();
a2.addAll(a1);
System.out.println("Newly created list " +a2);
for(Integer i:a2)
	System.out.println(i);
	}

}
