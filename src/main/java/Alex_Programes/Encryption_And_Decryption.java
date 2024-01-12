package Alex_Programes;

public class Encryption_And_Decryption {

	public static void main(String[] args) {
    String Text= "Jk.\"Jqy\"Ctg\"[qw\"A\"";
	System.out.println(Text);
	int Key=2;

    char[] Char= Text.toCharArray();
    
    for(char c: Char) {
//    	System.out.print(c);
    	c-=Key;
    	System.out.print(c);
  	
    }
    
    
	}

}
