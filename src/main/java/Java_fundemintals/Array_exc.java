package Java_fundemintals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_exc {
	
    //الطريقة الاولى لتعريف مصفوفه
	public static void main(String[] args) {
    String Brothers []= {"Mohamed", "Ahmad", "Abdullah","Haetham"};
    int    Age[]      = {41       ,      41,         39,       37};
//  System.out.println("First brother name and age is "+ Brothers[0]+ "  "+Age[0]);

	for (int i=0;i<4;i++) {
//	System.out.println(Brothers[i]);
	System.out.println(" brother name and age is "+ Brothers[i]+ "  "+Age[i]);
	}
	
	//الطريقة الثانية لتعريف مصفوفه
	int K=4; //من عندي تجربة تغيير عدد الانديكس
	//نعرف المصفوفة
	int[] array =new int[K];
	//نضيف المتغيرات
	array[0]=5;
	array[1]=4;
	array[2]=9;
	array[3]=9;
	for (int i=0;i<array.length;i++) {
	System.out.println(array[i]);
		}
	//Array list is flexible, grow , shrink , add ,remove print and find element
	ArrayList<String> Family=new ArrayList<>();
	Family.add("Mohamed");
	Family.add("Asma");
	Family.add("Jenna");
	Family.add("Naya");
    System.out.println(Family.contains("????"));// لمعرفة اذا ماكان اي اسم موجود في المصفوفة
//    System.out.println(Family.remove(1));
    System.out.println(Family.get(2));
    System.out.println(Family);
    
    //print using for each loop
    for(String FamilyMember:Family) {System.out.println(FamilyMember+" for loop ");}
    
    //print using Iterator 
    Iterator <String> ite = Family.iterator();
    while (ite.hasNext()) {
    	System.out.println (ite.next()+ "  this iterator");
    }
    
    // print using for each loop
     Family.forEach(System.out :: println);
    

	// Array list using Scanner and while loop
    String Sentences=" Hello world ";
    Scanner Scan =new Scanner(Sentences);
    ArrayList<String> Word=new ArrayList<String>();
//    while (Scan.hasNext()) {
//    Word.add(Scan.next());
//    }
      for (String x; Scan.hasNext();Word.add(x)) {
      x=Scan.next();
      }    
    Scan.close();
    System.out.println(Word);
	
	
	
	
	}}


