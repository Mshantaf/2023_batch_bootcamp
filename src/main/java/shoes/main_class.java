package shoes;


public class main_class {

	public static void main(String[] args) {
//		walking w=new walking(null, 0, false);
//		running r=new running(null, 0.0, 0.0);
	pair1();
	pair2();
	pair3();
		
	}
	static void pair1() {
	walking w=new walking("nike", 10, true);
	System.out.println(w.brand +" " + w.size + " "+w.goreTex);

		
	}	
	static void pair2() {
    walking w=new walking("addidas", 9, false);
	System.out.println(w.brand +" " + w.size +" " + w.goreTex);


		
	}
	static void pair3() {
	running r=new running("nike", 11, 45);
	System.out.println(r.brand +" " + r.size +" " + r.weight);


	}


}
