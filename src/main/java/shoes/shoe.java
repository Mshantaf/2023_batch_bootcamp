package shoes;

 class shoe {

	 String brand ;
	 double size;
	
	shoe(String brand ,double size ){
		this.brand=brand;
		this.size=size;
		
	}
}
class walking extends shoe {
    boolean goreTex;
	walking(String brand, double size, boolean goreTex) {
		super(brand, size);
		this.goreTex=goreTex;
	}
	public String toString() {
		return brand + " " + size + " " + goreTex ;}
}

class running extends shoe{
    double weight;
	running(String brand, double size,  double weight) {
		super(brand, size);
		this.weight=weight;
	}
	public String toString() {
		return brand + " " + size + " " + weight;
		}
	
}
	
	

