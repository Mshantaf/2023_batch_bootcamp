package Java_fundemintals;
//استعملنا سوبر لاستدعاء الامبلمنتيشن الي موجود في السوبر كلاس
class animal{
	void sound () { System.out.println("haw haw");}
	animal() {System.out.println("kkk");}
}

class cat extends animal {
	String cat;
	@Override	
    void sound ()  {
	//استعملنها هنا
	super.sound();
	System.out.println("meaw meaw");
} 
	cat(String cat) {this.cat=cat; System.out.println(cat);  }	
	
}

public class super_2 {

	public static void main(String[] args) {
	cat n = new cat("cat1111111");
    n.sound();	
}
	}


