package Java_fundemintals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
    Set <String> names= new HashSet<String>();
    names.add("Mohamed");
    names.add("asma");
    names.add("jenna");
    names.add("naya");
    
    //لايوجد تكرار للقيم
    names.add("naya");
    
    //معنى هاش انها ملخبطة، لايوجد اندكس للقيم 
//    System.out.println(names.get(0));

    
    //طباعه باستعمال ايتراتور
    Iterator <String > ite = names.iterator();
    while (ite.hasNext()) {
    	System.out.println(ite.next());
    }
    //طباعه باستعمال فور لووب
    for (String name : names) {
    	System.out.println(name);
    }
    //طباعه باستعمال فور ايتش
      names.forEach(System.out::println);
    
    
    
	}

}
