package Alex_Programes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_byme_HashSet {

	public static void main(String[] args) {
		
		String name ="Mohamad Hassn Elshantaf";
		
		char [] nameArray = name.toCharArray();
        Set<Character> dup=new HashSet<> ();
		for (int i=0 ; i<name.length(); i++) {
			for(int j=i+1; j<name.length(); j++) {
				if(nameArray[i]== nameArray[j]  ) {
					dup.add(nameArray[i]);
				}	
			}
		}
		System.out.print(dup);
     }
  }



