package Java_fundemintals;
//https://www.youtube.com/watch?v=52frlN8webg&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=79
//فتحنا  ابستراكت كلاس داخل الماين كلاس وسميه بدون اقواس صغيرة
//بتكتب ابستراكت كلاس بعدين اسم الكلاس وبدون اقواس صغيرة
//الفكرة الرئيسيه : اوت لاين للماين كلاس، 
//الفرق بينه وبين الانترفيس انه بيقبل امبليمنتد ميثود وأن امبلمنتد ميثود 
//ومش لازم ينفذ العمليات الا لو كانت ابستراكت ميثود
//ابستراكت كلاس  مابتقدر تستدعيه باوبجيكت 
//بنستعمل ساب كلاس عشان نعمل امبلمنت للميثود وبعدين لأستدعاء الميثود في الماين كلاس 
//لما يكون في كيرلي بريسيز او بادي بتكون ابستراكت او امبلمينتد ميثود
// abstract method cannot be static
abstract class ab   {
	//Unimplemented method
	 static void  setcolour() {};
	//Implemented method
	static  void sayHi() {
	System.out.println("hi");	
	}
	// في حالة عرفنا ابسراكت ميثود معناها لازم نعمللها امبليمنتيشن ،لاتستطيع تعريفها على انها ستاتيك
	 abstract  void sayhello();
}
//class to implement the method
class toimplement_method extends ab{
	 static void setcolour(){System.out.println("red");}

	@Override
	 void sayhello() {
    System.out.println("hello");		
	}
}

public class Abstract extends toimplement_method {

	public static void main(String[] args) {

		setcolour();
		sayHi();
		
		toimplement_method ob =new toimplement_method();
		ob.sayhello();
	}

}
