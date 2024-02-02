package Alex_Programes;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
    Scanner s =new  Scanner (System.in);
    System.out.println("enter your number");
    boolean prime= true;
    int n = s.nextInt();

    for (int i=2 ; i<n; i++) {
	if (n%i==0) {
		prime=false;
		break;
	}  
   }
   if (prime) {
	  System.out.println(n + "   is prime number "); 
   }else {
		  System.out.println(n + "   is not prime number"); 

   }
    
    

    }

}
