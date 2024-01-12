package Alex_Programes;

import java.util.Random;

public class Program_Fortune_Cookie {

	static String Q[]= {"I'm worried about a loved one.",
	"I'm worried about my finances.",
	"I'm worried that I'm not getting where I need to go fast enough.",
	"I'm worried that I forgot something at the grocery store."};
	
	public static void main(String[] args) {
		Random R = new Random();
		int A= R.nextInt(Q.length);
		System.out.println(Q[A]);
	}

}
