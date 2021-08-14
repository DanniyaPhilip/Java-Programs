package Prgm1;

public class Reversearr {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6}};
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<(a[j].length)-1;i++) {
				int temp=a[j][i];
				a[j][i]=a[j][(a[j].length)-i-1];
				a[j][(a[j].length-i)-1]=temp;
				//System.out.println(a[j].length);
				
		}
			}
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<(a[j].length);i++) {
				System.out.print(" "+a[j][i]);
			}
			System.out.println();
			

	}

} }
