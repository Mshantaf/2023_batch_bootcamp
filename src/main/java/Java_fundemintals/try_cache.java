package Java_fundemintals;

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
        System.out.println("only numbers, enter number ");	
      scan.nextLine();

    }
    }
    

	}

}
