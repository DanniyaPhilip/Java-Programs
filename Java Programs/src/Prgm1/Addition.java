package Prgm1;

public class Addition {

	public static void main(String[] args) {
                Addition.add(4,6);
				Addition.add(2, 0.9f);
			}
			public static void add(int a, int b) {
				int sum=a+b;
				System.out.println("Sum of integer numbers: "+sum);

			}
			public static void add(int a, float b) {
				float sum=a+b;
				System.out.println("Sum of integer and float numbers: "+sum);

		}
}


	


