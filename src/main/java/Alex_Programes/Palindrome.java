package Alex_Programes;
// اسماء اذا بتعكسها بتكون نفسها مثل mom , dad, 
public class Palindrome {

	public static void main(String[] args) {
    
	boolean Palindrome = true;	
	String word = "cat";
	String rev= "";

	for (int i = word.length()-1; i >=0;i--) {
		rev+=word.charAt(i);
	}
//	System.out.println(rev);
    for (int i=0 ; i<rev.length();i++) {
    	if (word.charAt(i)!=rev.charAt(i)) {
    		Palindrome=false;
    		break;
    	}

    } 	
    if (Palindrome) {System.out.println("its Palindrome ");}
    else {System.out.println("its not Palindrome");}

	}
	
	}
	

	



//String [] P= {"mom" , "dad" , "car"} ;
//for (int a=0 ; a<P.length;a++  ) {
//	for (int i=P[a].charAt();)
//	String CurrentWord=P[a].charAt();