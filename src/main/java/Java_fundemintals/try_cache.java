package Java_fundemintals;
//برنامج بس بقبل ارقام 
//عملنا سكانر
//وايل لوب ودايما ترو
//اذا ادخلنا رقم بتوقف عند بريك
//اذا ادخلنا حروف او اي اشي مش انتجر بصير خطا ، لكن مابوقف البرنامج عشان تراي اند كاتش
import java.util.Scanner;

public class try_cache {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    while (true) {
    try {
        System.out.println("enter number ");	
    	int a= scan.nextInt();
        System.out.println(a);
        break;
    }catch(Exception e) {
        System.out.println("Only numbers, enter number " + e);	
      scan.nextLine();

    }
    }
    

	}

}
