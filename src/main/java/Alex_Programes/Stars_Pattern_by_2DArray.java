package Alex_Programes;

import java.util.Scanner;

public class Stars_Pattern_by_2DArray {

	public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("Enter stars");
	int stars=Scan.nextInt();
	Scan.close();
	
for (int row=0; row<=stars;row++) {
	for (int colom=0;colom<row;colom++ ) {
		System.out.print("*");
	}
	System.out.println();
}
for (int row=stars-1; row>=0;row--) {
	for (int colom=0;colom<row;colom++ ) {
		System.out.print("*");
	}
	System.out.println();

	
	}

}}
