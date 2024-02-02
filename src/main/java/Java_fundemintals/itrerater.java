package Java_fundemintals;

import java.util.ArrayList;
import java.util.Iterator;

public class itrerater {

	public static void main(String[] args) {

    ArrayList numb= new ArrayList ();
    numb.add(10);
    numb.add(20);
    numb.add(30);
    numb.add(40);
    numb.add(50);
    
    Iterator it= numb.iterator();
     while (it.hasNext()) {
    	 if ((int)it.next()<30) {
           it.remove();    	 }
     }
	 System.out.println(numb);

    
    
	}

	}
