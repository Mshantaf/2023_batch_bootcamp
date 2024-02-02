package Java_fundemintals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class hash_tree_linkedhashSet {

	public static void main(String[] args) {		
		
    List<Integer> aaa = new ArrayList<>();
    aaa.add(5);
    aaa.add(5);
    aaa.add(5);
    aaa.add(2);
    aaa.add(3);
    System.out.println(aaa);
    for (int a : aaa) {System.out.println(a);}
    
    // 3 types of set
    // بتطبع بدون تكرار ولكن بدون ترتيب ولكن سريعة
      Set <Integer> m = new HashSet<>(aaa);
    
     // بتطبع بدون تكرار ولكن ترتيب ابجدي وبطيئة
      Set <Integer> l = new TreeSet<>(aaa);
      
    // بتطبع بدون تكرار ولكن  ترتيب على حسب الاولويه بالادخال سريعة
     Set <Integer> k = new LinkedHashSet<>(aaa);

    System.out.println(m); 
    }
    
	}


