package Alex_Programes;

import java.util.Scanner;

public class Reaction_time {

	public static void main(String[] args) throws InterruptedException {

	System.out.println("3");
	Thread.sleep(1000);
	System.out.println("2");
	Thread.sleep(1000);
	System.out.println("1");
	Thread.sleep(1000);
	System.out.println("GO !!!!!");
    long start_time= System.currentTimeMillis();
	Scanner scan = new Scanner (System.in);
    scan.next()	;
    long stop_time= System.currentTimeMillis();
    long reaction_time= stop_time -start_time  ;
    System.out.println(reaction_time);
    scan.close();
    
    
    
	}

}
