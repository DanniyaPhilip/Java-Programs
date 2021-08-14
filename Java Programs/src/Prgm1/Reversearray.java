package Prgm1;

public class Reversearray {

	public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6}};
	for (int i=0;i<a.length;i++) {
		for(int j=0;j<3;j++) {
	System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	for (int i=a.length-1;i>=0;i--) {
		for(int j=a[i].length-1;j>=0;j--) {
	System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
}
}
