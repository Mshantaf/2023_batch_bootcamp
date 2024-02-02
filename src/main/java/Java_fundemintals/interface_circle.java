package Java_fundemintals;

interface shape{
  double area(int r);	
  void Setcolour (String colour);

  // 1- in case to change it to return type
//  String Setcolour (String colour);
  
}

public class interface_circle implements shape {

	public static void main(String[] args) {
	interface_circle ob=new interface_circle();
	double Area=ob.area(2);
	System.out.println(Area);
	ob.Setcolour("green");
	
// 4- in case to change it to return type
//	String colour= ob.Setcolour("green");
//	System.out.println(colour);
	}
	
    // for encapsulation 
	private String colour;


	@Override
	public double area(int r) {
    return (Math.PI*r*r);		
	}

	@Override
	// 2- in case to change it to return type remove void and use string
	public void Setcolour(String colour) {
	this.colour= colour;	
	
	
	// 3- in case to change it to return type
//	return colour;
	}

}
