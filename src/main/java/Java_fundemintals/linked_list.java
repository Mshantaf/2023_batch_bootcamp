package Java_fundemintals;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args) {
    LinkedList<Integer> linky=new LinkedList <Integer> ();
    linky.add(1);
    linky.add(2);
    linky.add(3);
    
    System.out.println(linky);
    Iterator <Integer> it = linky.iterator();
    for (int i=0 ; i<linky.size();i++) {
    	if (it.next()==3) {
    		System.out.println("number 3 index is "+ i);
    	}
    }
    
    // using while loop
    // حطيت اتيريتر تاني، مااشتغل الاتريتور الاول مع وايل لووب
    Iterator <Integer> k = linky.iterator();
    while (k.hasNext()) { 
    if ( k.next()== 2) {
    	System.out.println(" 2 found it");
    }
    }
    	

	}}


