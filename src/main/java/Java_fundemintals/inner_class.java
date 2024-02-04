package Java_fundemintals;
//https://www.youtube.com/watch?v=Etk4zQHBplI&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=82
// ببساطة استدعاء كلاس من داخل كلاس وذلك بأنشاء كلاسين داخل بعض
//

class Outside{
	static int O=1;
	//جربت غيرتها الى ستاتيك واستدعيتها بدون انستانس وزبطت
	static void OutSideMethod() {System.out.println("this outside method");}
	
	class inside {
	int i= 5;	
	void insideMethod () {System.out.println("this inside method");}	
		
	}
}

public class inner_class extends Outside {

	public static void main(String[] args) {
		//استدعيتهم باسم الاكلاس فقط بعد ماحولتهم الى ستاتيك
		Outside.OutSideMethod();
		System.out.println(Outside.O +"  called by class name because its static");
        // نستدعي الكلاس الاكبر بشكل عادي
		Outside ob1 = new Outside();
		//استدعاء الكلاس الثاني
		Outside.inside ob2 =ob1.new inside();
		System.out.println(ob1.O+"  called by instance ");
		System.out.println(ob2.i);
		
	}

}
