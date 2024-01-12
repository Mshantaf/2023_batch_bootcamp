package Alex_Programes;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Multiple_Choice_Quiz_Program_myway {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in)	;
    String [] ExpectedAnswers  = new String [3];
    ExpectedAnswers[0]="a";
    ExpectedAnswers[1]="a";
    ExpectedAnswers[2]="b";
    String Actual_Answer[]= {"","",""};
//    String Expected_q1="a";
//    String Expected_q2= "b";
//    String Expected_q3= "c";
//	SoftAssert OK = new SoftAssert();
    int Score=0;
    System.out.println("Q1) What is your first name");
    System.out.println( "a) Mohamed");
    System.out.println("b) Ahmad");
    System.out.println("c) Abd");
    System.out.println("1st qoustion answer is  ");
    Actual_Answer[0]= Scan.next();
    if(ExpectedAnswers[0].equalsIgnoreCase(Actual_Answer[0]))
    {System.out.println("right answer Q1"); Score++;
    }else {System.out.println("Wrong answer Q1, re-enter Q1answer");Actual_Answer[0]= Scan.next();}
System.out.println("_____________________________________________");
    System.out.println("Q2) What is your futher name");
    System.out.println("a) Hassan");
    System.out.println("b) Ahmad");
    System.out.println("c) Abd");
    System.out.println("2nd qoustion answer is ");
    if(ExpectedAnswers[1].equalsIgnoreCase(Actual_Answer[1]))
    {System.out.println("right answer Q2"); Score++;
    }else {System.out.println("Wrong answer Q2, re-enter Q2answer");Actual_Answer[1]= Scan.next();}
System.out.println("_____________________________________________");



    System.out.println("Q3) What is your Last name");
    System.out.println("a) Mohamed");
    System.out.println("b) Elshantaf");
    System.out.println("c) Abd");
    System.out.println("3rd qoustion answer is ");
    if(ExpectedAnswers[2].equalsIgnoreCase(Actual_Answer[2]))
    {System.out.println("right answer Q3"); Score++;
    }else {System.out.println("Wrong answer Q3, re-enter Q3answer");Actual_Answer[2]= Scan.next();}
System.out.println("_____________________________________________");

	System.out.println(Score); 
    }
	 

	}
	


