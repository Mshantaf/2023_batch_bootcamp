package Alex_Programes;

import java.util.Random;

public class Magic_8_Ball {

	public static void main(String[] args) {
    Random R = new Random();
    int A=R.nextInt(5);
    
    if (A==0) {System.out.println(A + "  " + "hi");};
    if (A==1) {System.out.println(A+ "  " +"kefak");};
    if (A==2) {System.out.println(A+ "  " +"Hello");};
    if (A==3) {System.out.println(A+ "  " +"Aregato");};
    if (A!=0 && A!=1 && A!=2&& A!=3 ) {System.out.println(A+ "  " +"Empty");};

    



    
    
    
	}

}
