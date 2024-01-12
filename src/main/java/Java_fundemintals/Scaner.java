package Java_fundemintals;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
	//int input	
	Scanner scanner =new Scanner(System.in)	;
	System.out.println("Enter the Hourly rate =" );
	int Hourly_rate = scanner.nextInt();
	System.out.println("Enter the Hour/week = " );
	Double Hourperweek = scanner.nextDouble();
	System.out.println("pay/week= "  );
	double pay= Hourly_rate*Hourperweek;
	System.out.println("pay=" + pay + "$");
	

	}

}
