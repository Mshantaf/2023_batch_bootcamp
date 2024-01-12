package Concepts;

public class str_type {

	public static void main(String[] args) {

		String myString = "Hello";
//		String upper = myString.toLowerCase(); // Converts to "HELLO"
//        System.out.print(upper);
//
//		int length_myString=myString.length();
//	    System.out.println(length_myString);
//	    
	    StringBuilder ob=new StringBuilder(myString).reverse();
//        System.out.println(reversed);	
	    
        // Append
        ob.append(" World");

        // Insert
        ob.insert(5, ","); // Insert a comma at index 5

        // Delete
        ob.delete(0, 6); // Delete characters from index 0 to 5

        // Reverse
        ob.reverse();
        
        System.out.println( ob.append(" World") );
        System.out.println(ob.insert(5, ","));
        System.out.println(ob.delete(0, 6)+ "Deleted");

	}

}
