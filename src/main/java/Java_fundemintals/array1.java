package Java_fundemintals;

import java.util.ArrayList;
import java.util.Scanner;

public class array1 {
	
// هذا الكلاس عامله عشان اجرب كلاس Array_exc
	
	
	public static void main(String[] args) {
    ArrayList <String> expecteAnswers= new ArrayList<>();
    expecteAnswers.add("a");
    expecteAnswers.add("A");
    expecteAnswers.add("b");
    
    Scanner Scan =new Scanner(System.in);
    ArrayList <String> ActualAnswer= new ArrayList();
    ActualAnswer.add("");
    ActualAnswer.add("");
    ActualAnswer.add("");

    System.out.println("Q1) What is your first name");
	System.out.println( "a) Mohamed");
	System.out.println("b) Ahmad");
	System.out.println("c) Abd");
	System.out.println("1st qoustion answer is  ");
	ActualAnswer.set(0, Scan.next());
	System.out.println("_____________________________________________");

		
	System.out.println("Q2) What is your futher name");
	System.out.println("a) Hassan");
	System.out.println("b) Ahmad");
	System.out.println("c) Abd");
	System.out.println("2nd qoustion answer is ");
	ActualAnswer.set(1, Scan.next());
	System.out.println("_____________________________________________");


	    
	System.out.println("Q3) What is your Last name");
	System.out.println("a) Mohamed");
	System.out.println("b) Elshantaf");
	System.out.println("c) Abd");
	System.out.println("3rd qoustion answer is ");
	ActualAnswer.set(2, Scan.next());
	System.out.println("_____________________________________________");

	int score=0;
    for (int i=0;i<3;i++) {
    if (expecteAnswers.get(i).equalsIgnoreCase(ActualAnswer.get(i))) 

    score++;
    }
    System.out.println(score);
	
    }
}
