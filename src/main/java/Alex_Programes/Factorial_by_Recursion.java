package Alex_Programes;

public class Factorial_by_Recursion {
	
    //5!= 5 * 4 * 3 * 2 * 1  
	public static void main(String[] args) {
    System.out.println(factorial(5));		
		
	}
    public static int  factorial (int n) {
    if (n==1) {
    System.out.println("factorial ("+  n + ") = 1 ");
    // اخر قيمة ل ان هو شرط وقوف البرنامج وهو 1 base case
    return 1;
    }else {
    System.out.println("factorial (" +  n + ")= (" + n + ") * factorial (" + ( n -1 ) + ")");
    return n * factorial( n - 1 );
    } 
    	
    	
    }
}
