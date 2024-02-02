package Java_fundemintals;

public class replace_string_to_integer {

	public static void main(String[] args) {
	// convert string v to integer
    String V = "55";
    Integer.parseInt(V); 
    System.out.println(V+8);
    
    // convert integer to string
    int n = 55;
    System.out.println(Integer.toString(n)+66); 
    
    //remove the word from string and convert it to integer
    String f = "age is 41";
    f= f.replaceAll("\\D+" ,"");
    System.out.println(f);
	}

}
