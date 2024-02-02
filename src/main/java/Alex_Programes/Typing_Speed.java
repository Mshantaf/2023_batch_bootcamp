package Alex_Programes;

import java.util.Random;
import java.util.Scanner;

public class Typing_Speed {

	public static void main(String[] args) throws InterruptedException {
    String [] word = {"ssss", "aaa", "bbbb", "ccc"};
//	System.out.println("3");
//	Thread.sleep(1000);
//	System.out.println("2");
//	Thread.sleep(1000);
//	System.out.println("1");
//	Thread.sleep(1000);
	Random r=new Random();
	for (int i=0; i<6;i++) {
	System.out.print(word[r.nextInt(4)]+ " ");}
	System.out.println();
	Scanner s = new Scanner (System.in);
	String type = s.next();
	System.out.println(type);
	
	}


}
