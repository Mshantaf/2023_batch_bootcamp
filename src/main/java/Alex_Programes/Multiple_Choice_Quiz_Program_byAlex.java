package Alex_Programes;

import java.util.Scanner;

public class Multiple_Choice_Quiz_Program_byAlex {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in)	;
    String [] ExpectedAnswers  = new String [3];
	ExpectedAnswers[0]="a";
	ExpectedAnswers[1]="a";
	ExpectedAnswers[2]="b";
    String Actual_Answer[]= {"","",""};

	System.out.println("Q1) What is your first name");
	System.out.println( "a) Mohamed");
	System.out.println("b) Ahmad");
	System.out.println("c) Abd");
	System.out.println("1st qoustion answer is  ");
	System.out.println("_____________________________________________");
	
	System.out.println("Q2) What is your futher name");
	System.out.println("a) Hassan");
	System.out.println("b) Ahmad");
	System.out.println("c) Abd");
	System.out.println("2nd qoustion answer is ");
    System.out.println("_____________________________________________");
    
	System.out.println("Q3) What is your Last name");
	System.out.println("a) Mohamed");
	System.out.println("b) Elshantaf");
	System.out.println("c) Abd");
	System.out.println("_____________________________________________");
		
    int Score=0;
	System.out.println("1ST qoustion answer is ");
	Actual_Answer[0]= Scan.next();
	System.out.println("2nd qoustion answer is ");
	Actual_Answer[1]= Scan.next();
	System.out.println("3rd qoustion answer is ");
	Actual_Answer[2]= Scan.next();
    for(int i=0;i<2;i++) {
    	if(ExpectedAnswers[i].equalsIgnoreCase(Actual_Answer[i]));
    	Score++;
    }
    System.out.println("Your score is " +Score +"/3");
		    }
	}


