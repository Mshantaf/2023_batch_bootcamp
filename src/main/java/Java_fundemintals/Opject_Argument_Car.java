package Java_fundemintals;
//https://www.youtube.com/watch?v=nRJWltqX4UY

class garage {
	void parking1(rapit otherCat){
		
		System.out.println(otherCat.colour+ " car "+  "is in the garage");
	}
	
}


class rapit{
	String colour;
	rapit(String colour){
		this.colour=colour;
	}
}


public class Opject_Argument_Car {

	public static void main(String[] args) {
		rapit c1=new rapit("red" );
		rapit c2=new rapit("green" );
        garage g1=new garage();
		g1.parking1(c1);
		g1.parking1(c2);
	}

}
