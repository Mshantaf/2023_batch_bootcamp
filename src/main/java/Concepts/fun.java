package Concepts;

import java.util.Scanner;

public class fun {

	public static void main(String[] args) {
		Scanner enter=new Scanner (System.in);
		System.out.println("inter A");
		double A= enter.nextDouble();
		System.out.println("inter B");
		double B = enter.nextDouble();
		double C =  j( A, B);
		System.out.println("dividng total" + C);
        enter.close();
        
        fun j =new fun();   // لما مانستخدم ستاتيك لازم نستدعي الكلاس
        j.j();
        
        System.out.println("result of j(int e, int d  ) "+ "=  " + j(5,4) + "  SR");
        
        
    
	}
	
   
	
	public static double j(double A,double B ) {
		return A/B;
	}
	
    public  void  j() {  // we did not use static
    	int A=5;
    	int B=9;
    	int C= A+B;
		System.out.println(C);	
    }
    
    public static int j(int e, int d) {
        return e-d;
    	
    }
}
