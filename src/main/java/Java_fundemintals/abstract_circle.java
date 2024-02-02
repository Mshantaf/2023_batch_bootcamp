package Java_fundemintals;

abstract class vehicle {
public  abstract void horn () ;
void wheles (){}
int a;
} 

class for_implement extends vehicle{
	@Override
	public void horn() {
	a=5;
    System.out.println("beeb  "+ a);
    int b=a+5;
    System.out.println(b);
	}
	
	void wheles (){System.out.println("4");}	
}

public class abstract_circle extends for_implement {

	public static void main(String[] args) {
		for_implement ob = new for_implement();
		ob.horn();
		ob.wheles();
		
	}



}
